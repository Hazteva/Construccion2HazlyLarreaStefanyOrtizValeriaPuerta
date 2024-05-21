package tdea.construccion2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tdea.construccion2.app.Validators.BillInputsValidator;
import tdea.construccion2.app.Validators.PetInputsValidators;
import tdea.construccion2.app.controller.request.CreateBillRequest;
import tdea.construccion2.app.dto.BillDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.service.VetService;
import tdea.construccion2.controller.response.CreateBillResponse;

@RestController
public class SellerController {
    @Autowired
    private VetService vetService;
    
    @Autowired
    private BillInputsValidator billInputsValidator;
    @Autowired
    private PetInputsValidators petInputsValidators;
    
    
    @PostMapping("/Bill")
    public ResponseEntity<CreateBillResponse> createBill (@RequestBody CreateBillRequest request){
        CreateBillResponse response = new CreateBillResponse();
        long idBill;   
        try{
            idBill = billInputsValidator.idBillValidator(request.getIdBill());
            billInputsValidator.idPetValidator(request.getIdPet());
            billInputsValidator.idOwnerValidator(request.getIdOwner());
            billInputsValidator.productNameValidators(request.getProductName());
            billInputsValidator.priceValidators(request.getPrice());
            billInputsValidator.quantityValidator(request.getQuantity());
        }catch(Exception e){
            response.setMessageBill(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        try{
            /*BillDto billDto = new BillDto(idBill, PetDto idPet, PersonDto idOwner, SDtring productName, double price, int quantity, Date date);*/
            PetDto petDto = new PetDto();
            petDto.setIdPet(idBill);
            PersonDto personDto = new PersonDto();
            personDto.setId(idBill);
            
            BillDto billDto = new BillDto();
            vetService.createBill(billDto);
            response.setMessageBill("Factura creada");
            response.setIdBill(request.getIdBill());
            return ResponseEntity.ok().body(response);
        }catch(Exception e){
            response.setMessageBill(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
}
