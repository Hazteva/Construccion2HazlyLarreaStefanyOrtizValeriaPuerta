package app.controller;

import java.util.Scanner;


import app.Validators.BillInputsValidator;
import app.dto.BillDto;
import app.dto.PetDto;
import app.dto.PersonDto;
import app.Validators.PetInputsValidators;
import app.Validators.PersonInputsValidator;
import app.service.SellerService;
import app.service.VetService;

public class SellerController {
	
	private static Scanner reader = new Scanner(System.in); 
	private static BillInputsValidator billInputsValidator = new BillInputsValidator();
	private static PetInputsValidators petInputsValidator = new PetInputsValidators();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static SellerService sellerService = new VetService();
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
		billDto.setDate(null);
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
}
