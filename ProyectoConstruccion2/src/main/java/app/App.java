package app;

import app.config.MYSQLConnection;
import app.controller.AdministratorController;

public class App {

	public static void main(String[] args) {
		AdministratorController sellerController = new AdministratorController ();
		
		while(true){
		 try {
			 //MYSQLConnection.getConnection();
			 sellerController.createUser();
		     break;
		 }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		 }
		}
	}
}
