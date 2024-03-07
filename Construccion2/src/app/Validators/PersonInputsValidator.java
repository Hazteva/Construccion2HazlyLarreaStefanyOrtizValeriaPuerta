package app.Validators;

public class PersonInputsValidator extends InputsValidators{
	
	public void fullNameValidator(String fullName)throws Exception {
		super.stringValidator(fullName, " nombre");
	}
	
	public long idValidator(String number) throws Exception{
		return super.integerValidator(number, " id");	
	}
	
	public int ageValidator(String age) throws Exception{
		return super.integerValidator(age, " edad");	
	}
	
	public void rolValidator(String rol)throws Exception {
		super.stringValidator(rol, " rol");
	}
}
