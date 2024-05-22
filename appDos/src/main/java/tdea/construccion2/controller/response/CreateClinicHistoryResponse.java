package tdea.construccion2.controller.response;

public class CreateClinicHistoryResponse {
    private String date;
    private String messageClinicHistory;
    
    public CreateClinicHistoryResponse(){
        
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessageClinicHistory() {
        return messageClinicHistory;
    }

    public void setMessageClinicHistory(String messageClinicHistory) {
        this.messageClinicHistory = messageClinicHistory;
    }
}
