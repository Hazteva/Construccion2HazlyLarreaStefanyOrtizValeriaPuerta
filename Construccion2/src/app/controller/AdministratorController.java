package app.controller;

import java.util.Scanner;
import app.service.AdministratorService;
import app.service.VetService;
import app.Validators.PersonInputsValidator;
import app.Validators.UserNameInputsValidator;
import app.dto.PersonDto;
import app.dto.UserNameDto;

public class AdministratorController {
	
	private static UserNameInputsValidator userNameInputValidator;
	private static AdministratorService AdministratorService = new VetService();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static Scanner reader = new Scanner(System.in); 
	
	public void createUser()throws Exception {
		
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
		
		System.out.println("Ingrese el usuario");
		String userName = reader.nextLine();
		userNameInputValidator.userNameValidator(userName);
		
		System.out.println("Ingrese la contraseña");
		String password = reader.nextLine();
		userNameInputValidator.passwordValidator(password);
		
		PersonDto personDto = new PersonDto( id,  fullName,  age,  rol);
		UserNameDto userNameDto = new UserNameDto(userName, password, personDto);
		System.out.println("Se cumplieron todas las validaciones");
		
		AdministratorService.createUser(userNameDto);
	}
}
