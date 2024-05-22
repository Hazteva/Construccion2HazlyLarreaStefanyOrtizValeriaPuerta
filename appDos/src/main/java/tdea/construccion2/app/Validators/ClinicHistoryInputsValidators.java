package tdea.construccion2.app.Validators;

import org.springframework.stereotype.Component;

@Component
public class ClinicHistoryInputsValidators extends InputsValidators {

	public long dateValidators(String date)throws Exception {
		return super.integerValidator(date, " fecha");
	}
	
	public long petValidators(String pet)throws Exception {
		return super.integerValidator(pet, " id de la mascota");
	}
	
	public long veterinarianValidators(String veterinarian)throws Exception {
		return super.integerValidator(veterinarian, " nombre del veterinario");
	}
	
	public void reasonForConsultationValidators(String reasonForConsultation)throws Exception {
		super.stringValidator(reasonForConsultation, " razón de la consulta");
	}
	
	public void symptomatologyValidators(String symptomatology)throws Exception {
		super.stringValidator(symptomatology, " sintomatología");
	}
	
	public void procedureValidators(String procedure)throws Exception {
		super.stringValidator(procedure, " procedimiento");
	}
	
	public void medicinesValidators(String medicines)throws Exception {
		super.stringValidator(medicines, " medicamentos");
	}
	public long idOrderValidators(String idOrder)throws Exception {
		return super.integerValidator(idOrder, " orden medica");
	}
	
	public void vaccinationHistoryValidators(String vaccinationHistory)throws Exception {
		super.stringValidator(vaccinationHistory, " historial de vacunación");
	}
	
	public void allergiesValidators(String allergies)throws Exception {
		super.stringValidator(allergies, " alergias");
	}
	
	public void procedureDetailsValidators(String procedureDetails)throws Exception {
		super.stringValidator(procedureDetails, " detalles del procedimiento");
	}
        
        public void diagnosisValidators(String diagnosis)throws Exception {
		super.stringValidator(diagnosis, " diagnostico");
	}
        
        public void medicationDosageValidators(String medicationDosage)throws Exception {
		super.stringValidator(medicationDosage, " dosis del medicamento");
	}
        
       public boolean ordercancelationValidators(String ordercancelation) throws Exception {
            if (ordercancelation == null || ordercancelation.trim().isEmpty()) {
                throw new Exception("La cancelación de la orden no puede estar vacía.");
            }
                return true;
            }
}
