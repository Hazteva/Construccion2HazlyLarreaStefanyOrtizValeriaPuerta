package tdea.construccion2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tdea.construccion2.app.Validators.ClinicHistoryInputsValidators;
import tdea.construccion2.app.Validators.PersonInputsValidator;
import tdea.construccion2.app.Validators.PetInputsValidators;
import tdea.construccion2.app.controller.request.CreateClinicHistoryRequest;
import tdea.construccion2.app.controller.request.CreatePetRequest;
import tdea.construccion2.app.controller.request.CreateUserRequest;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.service.VetService;
import tdea.construccion2.controller.response.CreateClinicHistoryResponse;
import tdea.construccion2.controller.response.CreatePetResponse;
import tdea.construccion2.controller.response.CreateUserResponse;

@RestController
public class VeterinarianController {
    @Autowired
    private VetService vetService;
    @Autowired
    private PersonInputsValidator personInputsValidator;
    @Autowired
    private PetInputsValidators petInputsValidators;
    @Autowired
    private ClinicHistoryInputsValidators clinicHistoryInputsValidators;
     
    @PostMapping("/user")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request){
        CreateUserResponse response = new CreateUserResponse();
        long id;
        int age;
        try{
            id = personInputsValidator.idValidator(request.getId());
            age = personInputsValidator.ageValidator(request.getAge());
            personInputsValidator.fullNameValidator(request.getFullName());
            personInputsValidator.ageValidator(request.getAge());
            personInputsValidator.rolValidator(request.getPassword());
            personInputsValidator.passwordValidator(request.getPassword());
            personInputsValidator.userNameValidator(request.getUserName());
        }catch(Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        try{
            PersonDto personDto = new PersonDto(id, request.getFullName(),age, request.getRol(), request.getUserName(), request.getPassword());
            vetService.createUser(personDto);
            response.setMessage("Usuario creado");
            response.setId(request.getId());
            return ResponseEntity.ok().body(response);
        }catch(Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
    
    
    /*Agregar el pet*/
    @PostMapping("/pet")
    public ResponseEntity<CreatePetResponse> createPet(@RequestBody CreatePetRequest request){
        CreatePetResponse response = new CreatePetResponse();
        long idPet;
        try{
            idPet = petInputsValidators.idPetValidator(request.getIdPet());
            petInputsValidators.namePetValidator(request.getNamePet());
            petInputsValidators.ownerValidator(request.getOwner());
            petInputsValidators.namePetValidator(request.getNamePet());
            petInputsValidators.agePetValidator(request.getAgePet());
            petInputsValidators.speciesValidators(request.getSpecies());
            petInputsValidators.raceValidators(request.getRace());
            petInputsValidators.caracterisValidators(request.getCaracteris());
            petInputsValidators.weightValidators(request.getWeight());
        }catch(Exception e){
            response.setMessagePet(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        try{
            /*PetDto petDto = new PetDto(idPet, request.getNamePet(), request.getOwner(), request.getAgePet(), request.getSpecies(), request.getRace(), request.getCaracteris(), request.getWeight() );*/
            PetDto petDto = new PetDto();
            vetService.createPet(petDto);
            response.setMessagePet("Mascota creada");
            response.setIdPet(request.getIdPet());
            return ResponseEntity.ok().body(response);
        }catch(Exception e){
            response.setMessagePet(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    
    @PostMapping("/clinicHistory")
    public ResponseEntity<CreateClinicHistoryResponse> createClinicHistory(@RequestBody CreateClinicHistoryRequest request){
        CreateClinicHistoryResponse response = new CreateClinicHistoryResponse();
        long date;
        long pet;
        long veterinarian;
        long idOrder;
        try{
            date = clinicHistoryInputsValidators.dateValidators(request.getDate());
            pet = clinicHistoryInputsValidators.petValidators(request.getPet());
            veterinarian = clinicHistoryInputsValidators.veterinarianValidators(request.getVeterinarian());
            clinicHistoryInputsValidators.reasonForConsultationValidators(request.getReasonForConsultation());
            clinicHistoryInputsValidators.symptomatologyValidators(request.getSymptomatology());
            clinicHistoryInputsValidators.procedureValidators(request.getProcedure());
            clinicHistoryInputsValidators.medicinesValidators(request.getMedicines());
            idOrder = clinicHistoryInputsValidators.idOrderValidators(request.getIdOrder());
            clinicHistoryInputsValidators.vaccinationHistoryValidators(request.getVaccinationHistory());
            clinicHistoryInputsValidators.allergiesValidators(request.getAllergies());
            clinicHistoryInputsValidators.procedureDetailsValidators(request.getProcedureDetails());
            clinicHistoryInputsValidators.diagnosisValidators(request.getDiagnosis());
            clinicHistoryInputsValidators.medicationDosageValidators(request.getMedicationDosage());
            clinicHistoryInputsValidators.ordercancelationValidators(request.getOrdercancelation());
        }catch(Exception e){
            response.setMessageClinicHistory(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        
        try{
            PetDto petDto = new PetDto();
            petDto.setIdPet(pet);
            PersonDto personDto = new PersonDto();
            personDto.setId(veterinarian);
            OrderDto orderDto = new OrderDto();
            orderDto.setIdOrder(idOrder);
            ClinicHistoryDto clinicHistoryDto = new ClinicHistoryDto(date, petDto, personDto,request.getReasonForConsultation(), request.getSymptomatology(),request.getProcedure(),request.getMedicines(), orderDto,request.getVaccinationHistory(),request.getAllergies(),request.getProcedureDetails(),request.getDiagnosis(),request.getMedicationDosage(),request.getOrdercancelation());
            vetService.createClinicHistory(clinicHistoryDto);
            response.setMessageClinicHistory("History clinica creada");
            response.setDate(request.getDate());
            return ResponseEntity.ok().body(response);
        }catch(Exception e){
            response.setMessageClinicHistory(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
} 
 