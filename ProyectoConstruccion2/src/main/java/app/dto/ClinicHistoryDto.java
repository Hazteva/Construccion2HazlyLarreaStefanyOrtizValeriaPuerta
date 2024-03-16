package app.dto;

public class ClinicHistoryDto {
	private long date;
	private PersonDto veterinarian;
	private String reasonForConsultation;
	private String symptomatology;
	private String procedure;
	private String medicines;
	private OrderDto idOrder;
	private String vaccinationHistory;
	private String allergies;
	private String procedureDetails;
	

	public long getDate() {
		return date;
	}
	
	public void setDate(long date) {
		this.date = date;
	}
	
	public PersonDto getVeterinarian() {
		return veterinarian;
	}
	
	public void setVeterinarian(PersonDto veterinarian) {
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

	public OrderDto getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(OrderDto idOrder) {
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
