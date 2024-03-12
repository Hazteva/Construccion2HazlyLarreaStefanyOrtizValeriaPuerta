package app.dto;

import java.util.Date;

public class BillDto {
	private long idBill;
	private PetDto idPet;
	private PersonDto ownerId;
	private String productName;
	private double price;
	private int quantity;
	private Date date;
	
	public long getIdBill() {
		return idBill;
	}
	
	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}
	
	public PetDto getIdPet() {
		return idPet;
	}
	
	public void setIdPet(PetDto idPet) {
		this.idPet = idPet;
	}
	
	public PersonDto getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(PersonDto ownerId) {
		this.ownerId = ownerId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
