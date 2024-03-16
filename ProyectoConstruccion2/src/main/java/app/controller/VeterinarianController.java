package app.controller;

import java.util.Scanner;
import app.Validators.ClinicHistoryInputsValidators;
import app.Validators.OrderInputsValidators;
import app.Validators.PersonInputsValidator;
import app.service.VetService;
import app.service.VeterinarianService;
import app.Validators.PetInputsValidators;
import app.dto.OrderDto;
import app.dto.ClinicHistoryDto;
import app.dto.PersonDto;
import app.dto.PetDto;

public class VeterinarianController {
	
	private static VeterinarianService VeterinarianService = new VetService();
	private static PersonInputsValidator personInputsValidator = new PersonInputsValidator();
	private static OrderInputsValidators orderInputsValidators = new OrderInputsValidators();
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
		
		PersonDto personDto = new PersonDto();
		personDto.setId(id);
		personDto.setFullName(fullName);
		personDto.setAge(age);
		personDto.setRol(rol);
		personDto.setUserName(userName);
		personDto.setPassword(password);	
		VeterinarianService.createOwner(personDto);
	}
	
	public void createPet() throws Exception{
		System.out.println("Ingrese el nombre de la mascota");
		String namePet = reader.nextLine();
		petInputsValidator.namePetValidator(namePet);
		
		System.out.println("Ingrese la cedula del dueño");
		long idOwner = personInputsValidator.idValidator(reader.nextLine());
		PersonDto personDto= new PersonDto();
		personDto.setId(idOwner);
		
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
		
		PetDto petDto = new PetDto();
		petDto.setIdPet(idPet);
		petDto.setNamePet(namePet);
		petDto.setAgePet(agePet);
		petDto.setCaracteris(caracteris);
		petDto.setOwner(personDto);
		petDto.setSpecies(species);
		petDto.setRace(race);
		petDto.setCaracteris(caracteris);
		petDto.setWeight(weight);
		VeterinarianService.createPet(petDto);
	}
	
	public void createClinicHistory() throws Exception{
		
		System.out.println("Ingrese la cedula del veterinario");
		long idVeterinarian = personInputsValidator.idValidator(reader.nextLine());
		PersonDto personDto= new PersonDto();
		personDto.setId(idVeterinarian);
		
		System.out.println("Razones de la consulta");
		String reasonForConsultation = reader.nextLine();
		clinicHistoryInputsValidators.reasonForConsultationValidators(reasonForConsultation);
		
		System.out.println("Sintomatología");
		String symptomatology = reader.nextLine();
		clinicHistoryInputsValidators.symptomatologyValidators(symptomatology);
		
		System.out.println("Medicines");
		String medicines = reader.nextLine();
		clinicHistoryInputsValidators.medicinesValidators(medicines);
		
		System.out.println("Procedimiento");
		String procedure = reader.nextLine();
		clinicHistoryInputsValidators.procedureValidators(procedure);
		
		System.out.println("Ingrese el id de la orden");
		long idOrder = orderInputsValidators.idOrderValidator(reader.nextLine());
		OrderDto orderDto= new OrderDto();
		orderDto.setIdOrder(idOrder);
		
		System.out.println("Historial de vacunación");
		String vaccinationHistory = reader.nextLine();
		clinicHistoryInputsValidators.vaccinationHistoryValidators(vaccinationHistory);
		
		System.out.println("Alergias");
		String allergies = reader.nextLine();
		clinicHistoryInputsValidators.allergiesValidators(allergies);
		
		System.out.println("Detalles del procedimiento");
		String procedureDetails = reader.nextLine();
		clinicHistoryInputsValidators.procedureDetailsValidators(procedureDetails);
		
		ClinicHistoryDto clinicHistoryDto = new ClinicHistoryDto();
		clinicHistoryDto.setDate(System.currentTimeMillis());
		clinicHistoryDto.setReasonForConsultation(reasonForConsultation);
		clinicHistoryDto.setSymptomatology(symptomatology);
		clinicHistoryDto.setMedicines(medicines);
		clinicHistoryDto.setProcedure(procedureDetails);
		clinicHistoryDto.setVaccinationHistory(vaccinationHistory);
		clinicHistoryDto.setAllergies(allergies);
		clinicHistoryDto.setProcedureDetails(procedureDetails);
		VeterinarianService.createClinicHistory(clinicHistoryDto);
	}
	
	public void createOrder() throws Exception{
		PersonDto personDto= new PersonDto();
		
		System.out.println("Id de la orden");
		String idOrder = reader.nextLine();
		orderInputsValidators.idOrderValidator(idOrder);
		
		System.out.println("Ingrese el id de la mascota");
		long idPet = petInputsValidator.idPetValidator(reader.nextLine());
		PetDto petDto= new PetDto();
		petDto.setIdPet(idPet);
		
		System.out.println("Ingrese la cedula del dueño");
		long idOwner = personInputsValidator.idValidator(reader.nextLine());
		personDto.setId(idOwner);
		
		System.out.println("Ingrese la cedula del veterinario");
		long idVeterinarian = personInputsValidator.idValidator(reader.nextLine());
		personDto.setId(idVeterinarian);
		
		System.out.println("Medicamentos");
		String medicineName = reader.nextLine();
		orderInputsValidators.medicineNameValidator(medicineName);
		
		OrderDto orderDto = new OrderDto();
		orderDto.setIdOrder(idVeterinarian);
		orderDto.setIdOwner(personDto);
		orderDto.setIdPet(petDto);
		orderDto.setIdVeterinarian(personDto);
		orderDto.setMedicineName(medicineName);
		VeterinarianService.createOrder(orderDto);
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
