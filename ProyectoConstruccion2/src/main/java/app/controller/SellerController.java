package app.controller;

import java.util.Scanner;
import app.Validators.BillInputsValidator;
import app.Validators.PersonInputsValidator;
import app.service.AdministratorService;
import app.service.VetService;

public class SellerController {
	
	//private static AdministratorService AdministratorService = new VetService();
	private static Scanner reader = new Scanner(System.in); 
	private static BillInputsValidator billInputsValidator = new BillInputsValidator();

	public void createBill() throws Exception{
		System.out.println("Ingrese el id de la factura");
		//int idBill = billInputsValidator.integerValidator(reader.nextLine());
		
	}
}
