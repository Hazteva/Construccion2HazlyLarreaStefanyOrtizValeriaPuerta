package tdea.construccion2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tdea.construccion2.app.Validators.PersonInputsValidator;
import tdea.construccion2.app.Validators.PetInputsValidators;
import tdea.construccion2.app.controller.request.CreatePetRequest;

import tdea.construccion2.app.controller.request.CreateUserRequest;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.service.VetService;
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
    
    @PostMapping("/pet")
    public ResponseEntity<CreatePetResponse> createPet(@RequestBody CreatePetRequest request){
        CreatePetResponse response = new CreatePetResponse();
        int agePet;
        long idPet;
        long owner;
        double weight;
        try{
            idPet = petInputsValidators.idPetValidator(request.getIdPet());
            petInputsValidators.namePetValidator(request.getNamePet());
            owner = personInputsValidator.idValidator(request.getOwner());
            agePet = petInputsValidators.agePetValidator(request.getAgePet());
            petInputsValidators.speciesValidators(request.getSpecies());
            petInputsValidators.raceValidators(request.getRace());
            petInputsValidators.caracterisValidators(request.getCaracteris());
            weight = petInputsValidators.weightValidators(request.getWeight());
        }catch(Exception e){
            response.setMessagePet(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        try{
            PersonDto personDto = new PersonDto();
            personDto.setId(owner);
            PetDto petDto = new PetDto(idPet, request.getNamePet(), personDto, request.getSpecies(), request.getRace(), request.getCaracteris(), agePet, weight);
            vetService.createPet(petDto);
            response.setMessagePet("Mascota creada");
            response.setIdPet(request.getIdPet());
            return ResponseEntity.ok().body(response);
        }catch(Exception e){
            response.setMessagePet(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
} 
 