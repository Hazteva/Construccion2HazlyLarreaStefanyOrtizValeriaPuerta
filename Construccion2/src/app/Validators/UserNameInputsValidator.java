package app.Validators;

public class UserNameInputsValidator extends InputsValidators{
	
	public void userNameValidator(String userName)throws Exception {
		super.stringValidator(userName, " nombre de usuario");
	}
	
	public void passwordValidator(String password)throws Exception {
		super.stringValidator(password, " contraseña de usuario");
	}
	
	
}
