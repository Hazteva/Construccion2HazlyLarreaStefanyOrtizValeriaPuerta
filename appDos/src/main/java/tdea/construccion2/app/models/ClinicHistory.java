package tdea.construccion2.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.ClinicHistoryDto;

@Entity
@Table(name="historia")
public class ClinicHistory {
	@Id
	@Column(name="fecha")
	private long date;
        @ManyToOne
	@JoinColumn(name="mascota")
	private Pet pet;
        @ManyToOne
	@JoinColumn(name="medico")
	private Person veterinarian;
	@Column(name="motivo")
	private String reasonForConsultation;
	@Column(name="sintomatologia")
	private String symptomatology;
	@Column(name="procedimiento")
	private String procedure;
	@Column(name="medicamento")
	private String medicines;
        @ManyToOne
	@JoinColumn(name="orden")
	private Order idOrder;
	@Column(name="vacunacion")
	private String vaccinationHistory;
	@Column(name="alergia")
	private String allergies;
	@Column(name="detalles_procedimiento")
	private String procedureDetails;
        @Column (name= "diagnosis")
        private String diagnosis;
        @Column (name="medicationdosage")
        private String medicationDosage;
        @Column (name="ordercancelation")
        private boolean ordercancelation;
	
	public ClinicHistory(ClinicHistoryDto clinicHistoryDto) {
            this.date=clinicHistoryDto.getDate();
		this.pet=new Pet(clinicHistoryDto.getPet());
		this.veterinarian= new Person(clinicHistoryDto.getVeterinarian());
		this.reasonForConsultation=clinicHistoryDto.getReasonForConsultation();
		this.symptomatology=clinicHistoryDto.getSymptomatology();
		this.procedure=clinicHistoryDto.getProcedure();
		this.medicines=clinicHistoryDto.getMedicines();
		this.idOrder= new Order(clinicHistoryDto.getIdOrder());
		this.vaccinationHistory=clinicHistoryDto.getVaccinationHistory();
		this.allergies=clinicHistoryDto.getAllergies();
		this.procedureDetails=clinicHistoryDto.getProcedureDetails();
                this.diagnosis=clinicHistoryDto.getDiagnosis();
                this.medicationDosage=clinicHistoryDto.getMedicationDosage();
                this.ordercancelation=clinicHistoryDto.getOrdercancelation();
                
	} 
	
        public ClinicHistory(){
        
        }

	public long getDate() {
		return date;
	}
	
	public void setDate(long date) {
		this.date = date;
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public Person getVeterinarian() {
		return veterinarian;
	}
	
	public void setVeterinarian(Person veterinarian) {
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

        
}
