package tdea.construccion2.app.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Validators.PersonInputsValidator;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.service.LoginService;
import tdea.construccion2.app.service.VetService;

@Component
public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private PersonInputsValidator personInputValidator;
	@Autowired
	private AdministratorController administratorController;
	@Autowired
	private VeterinarianController veterinarianController;
	@Autowired
	private SellerController sellerController;

	
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


	public static Scanner getReader() {
		return reader;
	}


	public static void setReader(Scanner reader) {
		LoginController.reader = reader;
	}


	public PersonInputsValidator getPersonInputValidator() {
		return personInputValidator;
	}


	public void setPersonInputValidator(PersonInputsValidator personInputValidator) {
		this.personInputValidator = personInputValidator;
	}


	public AdministratorController getAdministratorController() {
		return administratorController;
	}


	public void setAdministratorController(AdministratorController administratorController) {
		this.administratorController = administratorController;
	}


	public VeterinarianController getVeterinarianController() {
		return veterinarianController;
	}


	public void setVeterinarianController(VeterinarianController veterinarianController) {
		this.veterinarianController = veterinarianController;
	}


	public SellerController getSellerController() {
		return sellerController;
	}


	public void setSellerController(SellerController sellerController) {
		this.sellerController = sellerController;
	}


	public static LoginService getLoginService() {
		return loginService;
	}


	public static void setLoginService(LoginService loginService) {
		LoginController.loginService = loginService;
	}
	
	
}
