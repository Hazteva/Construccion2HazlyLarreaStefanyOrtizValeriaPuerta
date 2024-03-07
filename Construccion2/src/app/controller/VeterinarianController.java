package app.controller;

import java.util.Scanner;

import app.Validators.PersonInputsValidator;
import app.service.VetService;
import app.service.VeterinarianService;

public class VeterinarianController {
	
	private static VeterinarianService VeterinarianService = new VetService();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static Scanner reader = new Scanner(System.in); 
	
	public void createOwner() throws Exception{
		System.out.println("Ingrese su nombre completo");
		String fullName = reader.nextLine();
		personInputsValidator.fullNameValidator(fullName);
		
		System.out.println("Ingrese su número de documento");
		long id = personInputsValidator.idValidator(reader.nextLine());
		
		
		System.out.println("Ingrese su edad");
		int age = personInputsValidator.ageValidator(reader.nextLine());
		
		
		System.out.println("Ingrese su rol");
		String rol = reader.nextLine();
		personInputsValidator.rolValidator(rol);
		
		
	}
}
