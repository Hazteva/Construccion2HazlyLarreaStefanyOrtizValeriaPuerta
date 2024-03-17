package app.controller;

import java.util.Scanner;

import app.Validators.BillInputsValidator;
import app.Validators.PersonInputsValidator;
import app.service.AdministratorService;
import app.service.BillService;
import app.service.VetService;

public class SellerController {
	
	//private static AdministratorService AdministratorService = new VetService();
	private static Scanner reader = new Scanner(System.in); 
	private static BillInputsValidator billInputsValidator = new BillInputsValidator();
	private static BillService BillService = (app.service.BillService) new VetService();
	private static final String MENU = "ingrese\n1.Para crear factura\n2.Para cerrar Sesion";

	public void createBill() throws Exception{
		
		System.out.println("Ingrese el id de la factura");
		Long idBill = billInputsValidator.idBillValidator(reader.nextLine());
		
		System.out.println("Ingrese el id de la mascota");
		Long idPet = billInputsValidator.idPetValidator(reader.nextLine());
		
		System.out.println("Ingrese el id del dueño");
		Long idOwner = billInputsValidator.idOwnerValidator(reader.nextLine());
		
		System.out.println("Ingrese el nombre del producto");
		String productName = reader.nextLine();
		billInputsValidator.productNameValidators(productName);
		
		System.out.println("Ingrese el precio");
		double price = billInputsValidator.priceValidators(reader.nextLine());	
	
		System.out.println("Ingrese la cantidad");
		int quantitty = billInputsValidator.quantityValidator(reader.nextLine());
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
