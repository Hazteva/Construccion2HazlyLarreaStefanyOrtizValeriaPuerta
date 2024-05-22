package tdea.construccion2.app.controller;

import java.sql.Date;
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
import tdea.construccion2.app.models.Person;
import tdea.construccion2.app.models.Pet;
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
        long idPet;
        long idOwner;
        double price;
        int quantity;
        Date date;
        try{
            idBill = billInputsValidator.idBillValidator(request.getIdBill());
            idPet = billInputsValidator.idPetValidator(request.getIdPet());
            idOwner = billInputsValidator.idOwnerValidator(request.getIdOwner());
            billInputsValidator.productNameValidators(request.getProductName());
            price = billInputsValidator.priceValidators(request.getPrice());
            quantity = billInputsValidator.quantityValidator(request.getQuantity());
            date =  new Date(billInputsValidator.dateValidator(request.getDate()));
        }catch(Exception e){
            response.setMessageBill(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        try{
            PetDto petDto = new PetDto();
            petDto.setIdPet(idPet);            
            PersonDto personDto = new PersonDto();
            personDto.setId(idOwner);
            BillDto billDto = new BillDto(idBill, petDto, personDto, request.getProductName(), price, quantity, date);
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
