package tdea.construccion2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tdea.construccion2.app.Validators.PersonInputsValidator;

import tdea.construccion2.app.controller.request.CreateUserRequest;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.service.VetService;
import tdea.construccion2.controller.response.CreateUserResponse;

@RestController
public class VeterinarianController {
    @Autowired
    private VetService vetService;
    
    @Autowired
    private PersonInputsValidator personInputsValidator;
    
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
    /*Agregar el clinicHistory*/
    /*Agregar el bill*/
} 
 