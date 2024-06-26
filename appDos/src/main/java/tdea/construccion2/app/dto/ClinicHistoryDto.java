package tdea.construccion2.app.dto;

import java.sql.Date;
import tdea.construccion2.app.models.ClinicHistory;
import tdea.construccion2.app.models.Pet;

public class ClinicHistoryDto {
	private long date;
	private PetDto pet;
	private PersonDto veterinarian;
	private String reasonForConsultation;
	private String symptomatology;
	private String procedure;
	private String medicines;
	private OrderDto idOrder;
	private String vaccinationHistory;
	private String allergies;
	private String procedureDetails;
        private String diagnosis;
        private String medicationDosage;
        private boolean ordercancelation;
	
	public ClinicHistoryDto(ClinicHistory clinicHistory) {
		this.date= clinicHistory.getDate();
		this.pet=new PetDto(clinicHistory.getPet());
		this.veterinarian= new PersonDto(clinicHistory.getVeterinarian());
		this.reasonForConsultation=clinicHistory.getReasonForConsultation();
		this.symptomatology=clinicHistory.getSymptomatology();
		this.procedure=clinicHistory.getProcedure();
		this.medicines=clinicHistory.getMedicines();
		this.idOrder=new OrderDto(clinicHistory.getIdOrder());
		this.vaccinationHistory=clinicHistory.getVaccinationHistory();
		this.allergies=clinicHistory.getAllergies();
		this.procedureDetails=clinicHistory.getProcedureDetails();
                this.diagnosis=clinicHistory.getDiagnosis();
                this.medicationDosage=clinicHistory.getMedicationDosage();
                this.ordercancelation=clinicHistory.getOrdercancelation();
	}

        public ClinicHistoryDto(long date, PetDto pet, PersonDto veterinarian, String reasonForConsultation, String symptomatology, String procedure, String medicines, OrderDto order, String vaccinationHistory, String allergies, String procedureDetails, String diagnosis, String medicationDosage, boolean ordercancelation) {
            this.date = date;
            this.pet = pet;
            this.veterinarian = veterinarian;
            this.reasonForConsultation = reasonForConsultation;
            this.symptomatology = symptomatology;
            this.procedure =procedure;
            this.medicines = medicines;
            this.idOrder = idOrder;
            this.vaccinationHistory = vaccinationHistory;
            this.allergies = allergies;
            this.procedureDetails = procedureDetails;
            this.diagnosis = diagnosis;
            this.medicationDosage = medicationDosage;
            this.ordercancelation  = ordercancelation;
        }
	public ClinicHistoryDto() {
		// TODO Auto-generated constructor stub
	}

	public long getDate() {
		return date;
	}
	
	public void setDate(long date) {
		this.date = date;
	}
	
	public PetDto getPet() {
		return pet;
	}
	
	public void setPet(PetDto pet) {
		this.pet = pet;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicationDosage() {
        return medicationDosage;
    }

    public void setMedicationDosage(String medicationDosage) {
        this.medicationDosage = medicationDosage;
    }

    public boolean getOrdercancelation() {
        return ordercancelation;
    }

    public void setOrdercancelation(boolean ordercancelation) {
        this.ordercancelation = ordercancelation;
    }

        
        
    public void setIdPet(PetDto petDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
