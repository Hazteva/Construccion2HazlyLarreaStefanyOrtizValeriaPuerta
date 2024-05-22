package tdea.construccion2.app.controller.request;

import java.sql.Date;
import org.antlr.v4.runtime.misc.NotNull;

public class CreateBillRequest {
    @NotNull	
    private String idBill;
    @NotNull	
    private String idPet;
    @NotNull	
    private String idOwner;
    @NotNull	
    private String productName;
    @NotNull	
    private String price;
    @NotNull	
    private String quantity;
    @NotNull	
    private String date;
    
    public CreateBillRequest (){
    
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getIdPet() {
        return idPet;
    }

    public void setIdPet(String idPet) {
        this.idPet = idPet;
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
