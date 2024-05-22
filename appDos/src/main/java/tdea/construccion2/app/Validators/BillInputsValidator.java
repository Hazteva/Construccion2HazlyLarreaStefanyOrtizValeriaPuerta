package tdea.construccion2.app.Validators;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class BillInputsValidator extends InputsValidators{
	
	public long idBillValidator(String number)throws Exception {
		return super.longValidator(number, "Id de la factura");
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
        
        public int dateValidator(String date) throws Exception{
		return super.integerValidator(date, " fecha");	
	}
}
