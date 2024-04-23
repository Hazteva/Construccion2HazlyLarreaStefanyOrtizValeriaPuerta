package app.controller;

import java.util.Scanner; 

import app.service.AdministratorService;
import app.service.VetService;
import app.Validators.PersonInputsValidator;
import app.dto.PersonDto;

public class AdministratorController {
	private static PersonInputsValidator personInputValidator = new PersonInputsValidator();
	private static AdministratorService administratorService = new VetService();
	private static Scanner reader = new Scanner(System.in); 
	private static final String MENU = "ingrese \n1.Para crear usuario \n2.Para cerrar Sesion";
	
	public void createUser()throws Exception {
		
		System.out.println("Ingrese el nombre completo");
		String fullName = reader.nextLine();
		personInputValidator.fullNameValidator(fullName);
		
		System.out.println("Ingrese la cedula");
		Long id = personInputValidator.idValidator(reader.nextLine());
		
		System.out.println("Ingrese la edad");
		int age = personInputValidator.ageValidator(reader.nextLine());
		
		System.out.println("Ingrese el rol");
		String rol = reader.nextLine();
		personInputValidator.rolValidator(rol);
		
		System.out.println("Ingrese nombre de usuario");
		String userName = reader.nextLine();
		personInputValidator.userNameValidator(userName);
		
		System.out.println("Ingrese la contraseña");
		String password = reader.nextLine();
		personInputValidator.passwordValidator(password);
		
		PersonDto personDto = new PersonDto(id, fullName, age, rol, userName, password);
		administratorService.createUser(personDto);
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
			createUser();
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
