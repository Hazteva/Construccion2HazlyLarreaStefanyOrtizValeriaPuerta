package app.controller;

import java.util.Scanner;
import app.Validators.PersonInputsValidator;
import app.dto.PersonDto;
import app.service.LoginService;
import app.service.VetService;

public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	private static PersonInputsValidator personInputValidator = new PersonInputsValidator();
	private static AdministratorController administratorController = new AdministratorController();
	private static VeterinarianController veterinarianController = new VeterinarianController();
	private static SellerController sellerController = new SellerController();

	
	private static LoginService loginService = new VetService();

	public void login() throws Exception {
		System.out.println("ingrese su usuario");
		String userName = reader.nextLine();
		personInputValidator.userNameValidator(userName);
		System.out.println("ingrese su contraseña");
		String password = reader.nextLine();
		personInputValidator.passwordValidator(password);
		PersonDto personDto = new PersonDto(userName, password);
		loginService.login(personDto);
		loginRouter(personDto);
		loginService.logout();
	}

	private void loginRouter(PersonDto personDto) {
		if (personDto.getRol().equals("Administrador")) {
			administratorController.session();
		} else if (personDto.getRol().equals("Veterinario")){
			veterinarianController.session();
		}else if (personDto.getRol().equals("Vendedor")) {
			sellerController.session();
		}
	}
}
