package app.models;

public class ClinicHistory {
	private String date;
	private String veterinarian;
	private String reasonForConsultation;
	private String symptomatology;
	private String procedure;
	private String medicines;
	private Order idOrder;
	private String vaccinationHistory;
	private String allergies;
	private String procedureDetails;
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getVeterinarian() {
		return veterinarian;
	}
	
	public void setVeterinarian(String veterinarian) {
		this.veterinarian = veterinarian;
	}
	
	public String getReasonForConsultation() {
		return reasonForConsultation;
	}
	
	public void setReasonForConsultation(String reasonForConsultation) {
		this.reasonForConsultation = reasonForConsultation;
	}
	
	public String getSymptomatology() {
		return symptomatology;
	}
	
	public void setSymptomatology(String symptomatology) {
		this.symptomatology = symptomatology;
	}
	
	public String getProcedure() {
		return procedure;
	}
	
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	
	public String getMedicines() {
		return medicines;
	}
	
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public Order getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Order idOrder) {
		this.idOrder = idOrder;
	}

	public String getVaccinationHistory() {
		return vaccinationHistory;
	}
	
	public void setVaccinationHistory(String vaccinationHistory) {
		this.vaccinationHistory = vaccinationHistory;
	}
	
	public String getAllergies() {
		return allergies;
	}
	
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	
	public String getProcedureDetails() {
		return procedureDetails;
	}
	
	public void setProcedureDetails(String procedureDetails) {
		this.procedureDetails = procedureDetails;
	}	

}
