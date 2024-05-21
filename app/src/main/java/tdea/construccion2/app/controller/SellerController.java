package tdea.construccion2.app.controller;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Validators.BillInputsValidator;
import tdea.construccion2.app.Validators.PersonInputsValidator;
import tdea.construccion2.app.Validators.PetInputsValidators;
import tdea.construccion2.app.dto.BillDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.service.SellerService;

@Component
public class SellerController {
	private static Scanner reader = new Scanner(System.in); 
	@Autowired
	private BillInputsValidator billInputsValidator;
	@Autowired
	private PetInputsValidators petInputsValidator;
	@Autowired
	private PersonInputsValidator personInputsValidator;
	@Autowired
	private SellerService sellerService;
	private static final String MENU = "ingrese\n1.Para crear factura\n2.Para cerrar Sesion";

	public void createBill() throws Exception{
		
		System.out.println("Ingrese el id de la factura");
		Long idBill = billInputsValidator.idBillValidator(reader.nextLine());
		
		System.out.println("Ingrese el id de la mascota");
		long idPet = petInputsValidator.idPetValidator(reader.nextLine());
		PetDto petDto= new PetDto();
		petDto.setIdPet(idPet);
		
		System.out.println("Ingrese la cedula del dueño");
		long idOwner = personInputsValidator.idValidator(reader.nextLine());
		PersonDto personDto = new PersonDto();
		personDto.setId(idOwner);
		
		System.out.println("Ingrese el nombre del producto");
		String productName = reader.nextLine();
		billInputsValidator.productNameValidators(productName);
		
		System.out.println("Ingrese el precio");
		double price = billInputsValidator.priceValidators(reader.nextLine());	
	
		System.out.println("Ingrese la cantidad");
		int quantitty = billInputsValidator.quantityValidator(reader.nextLine());
		
		BillDto billDto = new BillDto();
		billDto.setDate(new Date(System.currentTimeMillis()));
		billDto.setIdBill(idBill);
		billDto.setIdPet(petDto);
		billDto.setOwnerId(personDto);
		billDto.setPrice(price);
		billDto.setProductName(productName);
		billDto.setQuantity(quantitty);
		sellerService.createBill(billDto);
	}
	
	
	public void session() {
		boolean runApp = true;
		while (runApp) {
			try {
				System.out.println(MENU);
				String option = reader.nextLine();
				runApp=menu(option);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private boolean menu(String option) throws Exception{
		switch (option) {
		case "1":{
			createBill();
			return true;
		}
		case "2": {
			return false;
		}
		default :{
			System.out.println("Ingrese una opcion valida");
			return true;
			}
		}
	}


	public BillInputsValidator getBillInputsValidator() {
		return billInputsValidator;
	}


	public void setBillInputsValidator(BillInputsValidator billInputsValidator) {
		this.billInputsValidator = billInputsValidator;
	}


	public PetInputsValidators getPetInputsValidator() {
		return petInputsValidator;
	}


	public void setPetInputsValidator(PetInputsValidators petInputsValidator) {
		this.petInputsValidator = petInputsValidator;
	}


	public PersonInputsValidator getPersonInputsValidator() {
		return personInputsValidator;
	}


	public void setPersonInputsValidator(PersonInputsValidator personInputsValidator) {
		this.personInputsValidator = personInputsValidator;
	}


	public SellerService getSellerService() {
		return sellerService;
	}


	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	
        
}
