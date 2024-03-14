package app.controller;

import java.util.Scanner;

import app.Validators.ClinicHistoryInputsValidators;
import app.Validators.PersonInputsValidator;
import app.service.VetService;
import app.service.VeterinarianService;
import app.Validators.PetInputsValidators;
import app.dto.OrderDto;
import app.dto.ClinicHistoryDto;
import app.dto.PersonDto;

public class VeterinarianController {
	
	private static VeterinarianService VeterinarianService = new VetService();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static PetInputsValidators petInputsValidator = new PetInputsValidators();
	private static ClinicHistoryInputsValidators clinicHistoryInputsValidators = new ClinicHistoryInputsValidators();
	private static final String MENU = "ingrese\n1.Para crear dueño\n2.Para crear mascota \n3.Para crear historia clinica \n4.Para crear orden";
	private static Scanner reader = new Scanner(System.in); 
	
	public void createOwner() throws Exception{
		System.out.println("Ingrese el nombre completo");
		String fullName = reader.nextLine();
		personInputsValidator.fullNameValidator(fullName);
		
		System.out.println("Ingrese el número de documento");
		long id = personInputsValidator.idValidator(reader.nextLine());
		
		
		System.out.println("Ingrese la edad");
		int age = personInputsValidator.ageValidator(reader.nextLine());
		
		String rol ="owner";
		
		String userName ="N/A";
		
		String password ="N/A";
		
		
		PersonDto personDto = new PersonDto(id, fullName, age, rol, userName, password);
		VeterinarianService.createOwner(personDto);
		//Duda: no necesito los otros parametros, entonces que hago para crear el dueño
		//Toca preguntarle al profe como hacemos que esos parametros no sean necesarios ya que por el 
		//no deja
	}
	
	public void createPet() throws Exception{
		System.out.println("Ingrese el nombre de la mascota");
		String namePet = reader.nextLine();
		petInputsValidator.namePetValidator(namePet);
		
		System.out.println("Ingrese los datos del dueño");
//DATOS DEL DUEÑO 
		
		System.out.println("Ingrese la edad de la mascota");
		int agePet = petInputsValidator.agePetValidator(reader.nextLine());
		
		System.out.println("Ingrese la edad");
		long idPet = petInputsValidator.idPetValidator(reader.nextLine());
		
		System.out.println("Ingrese la especie");
		String species = reader.nextLine();
		petInputsValidator.speciesValidators(species);
		
		System.out.println("Ingrese la raza");
		String race = reader.nextLine();
		petInputsValidator.raceValidators(race);
		
		System.out.println("Ingrese las caracteristicas");
		String caracteris = reader.nextLine();
		petInputsValidator.caracterisValidators( caracteris);
		
		System.out.println("Ingrese la edad");
		double weight = petInputsValidator.weightValidators(reader.nextLine());	
		
		PetDto petDto = new PetDto(namePet, Owner, agePet, idPet, species, race, caracteris, weight);
		VeterinarianService.createPet(petDto);
	}
	
	public void createClinicHistory() throws Exception{
		//Creación de la fehca
		
		//Creación de los datos del veterinario
		
		System.out.println("Razones de la consulta");
		String reasonForConsultation = reader.nextLine();
		clinicHistoryInputsValidators.reasonForConsultationValidators(reasonForConsultation);
		
		System.out.println("Sintomatología");
		String symptomatology = reader.nextLine();
		clinicHistoryInputsValidators.symptomatologyValidators(symptomatology);
		
		System.out.println("Procedimiento");
		String medicines = reader.nextLine();
		clinicHistoryInputsValidators.medicinesValidators(medicines);
		
		System.out.println("Procedimiento");
		String procedure = reader.nextLine();
		clinicHistoryInputsValidators.procedureValidators(procedure);
		
		//Llamar el id de la clase orden
		
		System.out.println("Procedimiento");
		String vaccinationHistory = reader.nextLine();
		clinicHistoryInputsValidators.vaccinationHistoryValidators(vaccinationHistory);
		
		System.out.println("Procedimiento");
		String allergies = reader.nextLine();
		clinicHistoryInputsValidators.allergiesValidators(allergies);
		
		System.out.println("Procedimiento");
		String procedureDetails = reader.nextLine();
		clinicHistoryInputsValidators.procedureDetailsValidators(procedureDetails);
		
		ClinicHistoryDto clinicHistoryDto = new ClinicHistoryDto(reasonForConsultation, symptomatology,idOrder, vaccinationHistory, allergies, procedureDetails);
		VeterinarianService.createClinicHistory(clinicHistoryDto);
	}
	
	public void createOrder() throws Exception{
		
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
			createOwner();
			return true;
		}
		case "2": {
			createPet();
			return false;
		}
		case "3": {
			createClinicHistory();
			return false;
		}
		case "4": {
			createOrder();
			return false;
		}
		case "5": {
			return false;
		}
		default :{
			System.out.println("Ingrese una opcion valida");
			return true;
		}
		}
	}
}
