package app.Validators;

public class PetInputsValidators extends InputsValidators {

	public void productNameValidators(String productName)throws Exception {
		super.stringValidator(productName, " nombre de la mascota");
	}
	
	public void ownerValidator(String owner)throws Exception {
		super.stringValidator(owner, " nombre del dueño");
	}
	
	public int agePetValidator(String agePet) throws Exception{
		return super.integerValidator(agePet, " edad de la mascota");	
	}
	
	public long idPetValidator(String idPet) throws Exception{
		return super.integerValidator(idPet, " id de la mascota");	
	}
	
	public void speciesValidators(String species)throws Exception {
		super.stringValidator(species, " especie");
	}
	
	public void raceValidators(String race)throws Exception {
		super.stringValidator(race, " raza");
	}
	
	public void caracterisValidators(String caracteris)throws Exception {
		super.stringValidator(caracteris, " caracteristicas");
	}
	
	public double weightValidators(String weight)throws Exception {
		return super.doubleValidator(weight, " peso");
	}
	
	
}
