package app.controller;

import java.util.Scanner;
import app.Validators.ClinicHistoryInputsValidators;
import app.Validators.PersonInputsValidator;
import app.service.VetService;
import app.service.VeterinarianService;
import app.Validators.PetInputsValidators;

public class VeterinarianController {
	
	private static VeterinarianService VeterinarianService = new VetService();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static PetInputsValidators petInputsValidator = new PetInputsValidators();
	private static ClinicHistoryInputsValidators clinicHistoryValidators = new ClinicHistoryInputsValidators();
	private static Scanner reader = new Scanner(System.in); 
	
	public void createOwner() throws Exception{
		System.out.println("Ingrese el nombre completo");
		String fullName = reader.nextLine();
		personInputsValidator.fullNameValidator(fullName);
		
		System.out.println("Ingrese el número de documento");
		long id = personInputsValidator.idValidator(reader.nextLine());
		
		
		System.out.println("Ingrese la edad");
		int age = personInputsValidator.ageValidator(reader.nextLine());
		
		
		System.out.println("Ingrese el rol");
		String rol = reader.nextLine();
		personInputsValidator.rolValidator(rol);
	}
	
	public void createPet() throws Exception{
		System.out.println("Ingrese el nombre completo");
		String fullName = reader.nextLine();
		personInputsValidator.fullNameValidator(fullName);
		
		System.out.println("Ingrese el número de documento");
		long id = personInputsValidator.idValidator(reader.nextLine());
		
		
		System.out.println("Ingrese la edad");
		int age = personInputsValidator.ageValidator(reader.nextLine());
	}
	
	public void createClinicHistory() throws Exception{
	}
	
	public void createOrder() throws Exception{
		
	}
}
