package app.Validators;

public class BillInputsValidator extends InputsValidators{
	
	public long idBillValidator(String number)throws Exception {
		return super.integerValidator(number, " id de la factura");
	}
	
	public long idPetValidator(String idPet) throws Exception{
		return super.integerValidator(idPet, " id de la mascota");	
	}
	
	public long idOwnerValidator(String idOwner)throws Exception {
		return super.integerValidator(idOwner, " id del dueño");
	}
	
	public void productNameValidators(String productName)throws Exception {
		super.stringValidator(productName, " nombre del producto");
	}
	
	public double priceValidators(String price)throws Exception {
		 return super.doubleValidator(price, " precio del producto");
	}
	
	public int quantityValidator(String quantity) throws Exception{
		return super.integerValidator(quantity, " edad");	
	}
}
