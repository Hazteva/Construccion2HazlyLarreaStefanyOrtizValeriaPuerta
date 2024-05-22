package tdea.construccion2.app.controller.request;

import org.antlr.v4.runtime.misc.NotNull;

public class CreateClinicHistoryRequest {
    @NotNull
    private String date;
    @NotNull
    private String pet;
    @NotNull
    private String veterinarian;
    @NotNull
    private String reasonForConsultation;
    @NotNull
    private String symptomatology;
    @NotNull
    private String procedure;
    @NotNull
    private String medicines;
    @NotNull
    private String idOrder;
    @NotNull
    private String vaccinationHistory;
    @NotNull
    private String allergies;
    @NotNull
    private String procedureDetails;
    @NotNull
    private String diagnosis;
    @NotNull
    private String medicationDosage;
    @NotNull
    private String ordercancelation; 

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
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

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
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

    public String getOrdercancelation() {
        return ordercancelation;
    }

    public void setOrdercancelation(String ordercancelation) {
        this.ordercancelation = ordercancelation;
    }
}
