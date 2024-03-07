package app;

import app.controller.AdministratorController;

public class App {

	public static void main(String[] args) {
		AdministratorController sellerController = new AdministratorController ();
		
		while(true){
		 try {
			 sellerController.createUser();
		     break;
		 }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		 }
		}
	}
}
