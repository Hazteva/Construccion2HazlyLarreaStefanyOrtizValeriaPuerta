package app.dao;

import app.dto.PersonDto;

public class BillDaoImp {
	
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
}
