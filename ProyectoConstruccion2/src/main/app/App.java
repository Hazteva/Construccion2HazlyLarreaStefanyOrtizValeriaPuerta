package app;

import java.util.Scanner;

import app.controller.LoginController;
import app.controller.VeterinarianController;
import app.controller.AdministratorController;
import app.controller.SellerController;

public class App {

	private static Scanner reader = new Scanner(System.in);
	private static LoginController loginController = new LoginController();
	private static VeterinarianController veterinarianController = new VeterinarianController();
	private static AdministratorController administratorController = new AdministratorController();
	private static SellerController sellerController = new SellerController();

	
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
	
	public static boolean runApplication() throws Exception {
		String menu = "ingrese \n1.Para iniciar sesion\n2.Para ingresar como veterianrio \n3.Para ingresar como administrador \n3.Para ingresar como vendedor";
		System.out.println(menu);
		String option = reader.nextLine();
		switch (option) {
		case "1": {
			loginController.login();
			return true;
		}
		case "2": {
			veterinarianController.session();
			return true;
		}
		case "3": {
			administratorController.session();
			return true;
		}
		case "4": {
			sellerController.session();
			return true;
		}
		default: {
			System.out.print("ingrese una opcion valida");
			return true;
		}

		}

	}
}
