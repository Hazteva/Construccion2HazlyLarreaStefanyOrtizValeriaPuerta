package app.controller;

import java.util.Scanner;

import app.Validators.OrderInputsValidators;
import app.dto.PersonDto;
import app.service.OrderService;
import app.service.VetService;
import app.Validators.PetInputsValidators;

public class OrderController {
	private static OrderInputsValidators orderInputsValidators = new OrderInputsValidators();
	private static OrderService orderService = new VetService();
	private static Scanner reader = new Scanner(System.in); 

	
	public void createOrder()throws Exception {
		
		System.out.println("Ingrese la orden");
		Long idOrder = orderInputsValidators.idOrderValidator(reader.nextLine());
		
		System.out.println("Ingrese el id de la mascota");
		
		//Hay que preguntar como llamar siendo una clase 
		
		
	}

}
