package tdea.construccion2.app.controller;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tdea.construccion2.app.Validators.ClinicHistoryInputsValidators;
import tdea.construccion2.app.Validators.OrderInputsValidators;
import tdea.construccion2.app.Validators.PersonInputsValidator;
import tdea.construccion2.app.service.VeterinarianService;
import tdea.construccion2.app.Validators.PetInputsValidators;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;

@Component
public class VeterinarianController {
	@Autowired
	private VeterinarianService VeterinarianService;
        @Autowired
	private PersonInputsValidator personInputsValidator;
        @Autowired
	private OrderInputsValidators orderInputsValidators;
        @Autowired
	private PetInputsValidators petInputsValidator;
        @Autowired
	private ClinicHistoryInputsValidators clinicHistoryInputsValidators;
	private static final String MENU = "ingrese \n1.Para crear dueño \n2.Para crear mascota \n3.Para crear historia clinica \n4.Para crear orden";
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
		personDto.setFullName(fullName);
		personDto.setId(id);
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
		
		System.out.println("Ingrese el id de la mascota");
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
		
		System.out.println("Ingrese el peso");
		double weight = petInputsValidator.weightValidators(reader.nextLine());	
		
		PetDto petDto = new PetDto();
		petDto.setNamePet(namePet);
		petDto.setOwner(personDto);
		petDto.setAgePet(agePet);
		petDto.setIdPet(idPet);
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
		
		System.out.println("Ingrese la mascota");
		long idPet = petInputsValidator.idPetValidator(reader.nextLine());
		PetDto petDto= new PetDto();
		petDto.setIdPet(idPet);
		
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
		
		
		System.out.println("Historial de vacunación");
		String vaccinationHistory = reader.nextLine();
		clinicHistoryInputsValidators.vaccinationHistoryValidators(vaccinationHistory);
		
		System.out.println("Alergias");
		String allergies = reader.nextLine();
		clinicHistoryInputsValidators.allergiesValidators(allergies);
		
		System.out.println("Detalles del procedimiento");
		String procedureDetails = reader.nextLine();
		clinicHistoryInputsValidators.procedureDetailsValidators(procedureDetails);
                
                System.out.println("Diagnostico");
		String diagnosis = reader.nextLine();
		clinicHistoryInputsValidators.diagnosisValidators(diagnosis);
                
                System.out.println("Dosis del medicamento");
		String medicationDosage = reader.nextLine();
		clinicHistoryInputsValidators.medicationDosageValidators(medicationDosage);
                
                System.out.println("Cancelar odern");
		String ordercancelation = reader.nextLine();
		clinicHistoryInputsValidators.ordercancelationValidators(ordercancelation);
		
		ClinicHistoryDto clinicHistoryDto = new ClinicHistoryDto();
		clinicHistoryDto.setDate(System.currentTimeMillis());
		clinicHistoryDto.setVeterinarian(personDto);
		clinicHistoryDto.setPet(petDto);
                System.out.println("id de la mascota" + " " + clinicHistoryDto.getPet().getIdPet());
		clinicHistoryDto.setReasonForConsultation(reasonForConsultation);
		clinicHistoryDto.setSymptomatology(symptomatology);
		clinicHistoryDto.setMedicines(medicines);
		clinicHistoryDto.setProcedure(procedureDetails);
		/*clinicHistoryDto.setIdOrder(orderDto);*/
		clinicHistoryDto.setVaccinationHistory(vaccinationHistory);
		clinicHistoryDto.setAllergies(allergies);
		clinicHistoryDto.setProcedureDetails(procedureDetails);
                clinicHistoryDto.setDiagnosis(diagnosis);
                clinicHistoryDto.setMedicationDosage(medicationDosage);
                clinicHistoryDto.setOrdercancelation(false);
		VeterinarianService.createClinicHistory(clinicHistoryDto);
	}
	
	public void createOrder() throws Exception{
		PersonDto personDto= new PersonDto();
		
		System.out.println("Id de la orden");
		long idOrder = orderInputsValidators.idOrderValidator(reader.nextLine());
		
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
		orderDto.setIdOrder(idOrder);
		orderDto.setIdPet(petDto);
		orderDto.setIdOwner(personDto);
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
			return true;
		}
		case "3": {
			createClinicHistory();
			return true;
		}
                case "5":{return false;}
		default :{
			System.out.println("Ingrese una opcion valida");
			return true;
		}
		}
	}

    public VeterinarianService getVeterinarianService() {
        return VeterinarianService;
    }

    public void setVeterinarianService(VeterinarianService VeterinarianService) {
        this.VeterinarianService = VeterinarianService;
    }

    public PersonInputsValidator getPersonInputsValidator() {
        return personInputsValidator;
    }

    public void setPersonInputsValidator(PersonInputsValidator personInputsValidator) {
        this.personInputsValidator = personInputsValidator;
    }

    public OrderInputsValidators getOrderInputsValidators() {
        return orderInputsValidators;
    }

    public void setOrderInputsValidators(OrderInputsValidators orderInputsValidators) {
        this.orderInputsValidators = orderInputsValidators;
    }

    public PetInputsValidators getPetInputsValidator() {
        return petInputsValidator;
    }

    public void setPetInputsValidator(PetInputsValidators petInputsValidator) {
        this.petInputsValidator = petInputsValidator;
    }

    public ClinicHistoryInputsValidators getClinicHistoryInputsValidators() {
        return clinicHistoryInputsValidators;
    }

    public void setClinicHistoryInputsValidators(ClinicHistoryInputsValidators clinicHistoryInputsValidators) {
        this.clinicHistoryInputsValidators = clinicHistoryInputsValidators;
    }
}
