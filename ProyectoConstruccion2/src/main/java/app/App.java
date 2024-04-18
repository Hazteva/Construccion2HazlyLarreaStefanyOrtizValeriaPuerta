package app;

import java.util.Scanner;

import app.controller.LoginController;
import app.controller.VeterinarianController;
import app.controller.AdministratorController;
import app.controller.SellerController;

public class App {

	private static Scanner reader = new Scanner(System.in);
	private static LoginController loginController = new LoginController();
	private static AdministratorController administratorController = new AdministratorController();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			try {
				run = runApplication();
				//Connection con = MYSQLConnection.getConnection();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.print("deteniendo la aplicacion");
		
	}
	
	//hola
	public static boolean runApplication() throws Exception {
		String menu = "Ingrese \n1.Para iniciar sesion \n2.Para crear usuario \n3.Para cerrar la aplicacion ";
		System.out.println(menu);
		String option = reader.nextLine();
		switch (option) {
		case "1": {
			loginController.login();
			return true;
		}
		case "2": {
			administratorController.createUser();
			return true;
		}
		case "3": {
			return false;
		}
		default: {
			System.out.print("Ingrese una opción valida");
			return true;
		}

		}
	}
}