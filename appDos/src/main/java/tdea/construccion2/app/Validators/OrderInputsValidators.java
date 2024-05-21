package tdea.construccion2.app.Validators;

import org.springframework.stereotype.Component;

@Component
public class OrderInputsValidators extends InputsValidators {
	
	public long idOrderValidator(String idOrder)throws Exception {
		return super.integerValidator(idOrder, " id de la orden");
	}
	
	public long idPetValidator(String idPet) throws Exception{
		return super.integerValidator(idPet, " id de la mascota");	
	}
	
	public long idOwnerValidator(String idOwner)throws Exception {
		return super.integerValidator(idOwner, " id del dueño");
	}
	
	public long idVeterinarianValidator(String idVeterinarian)throws Exception {
		return super.integerValidator(idVeterinarian, " id del veterinario");
	}
	
	public void medicineNameValidator(String medicineName)throws Exception {
		super.stringValidator(medicineName, " nombre de los medicametos");
	}
	
	
}
