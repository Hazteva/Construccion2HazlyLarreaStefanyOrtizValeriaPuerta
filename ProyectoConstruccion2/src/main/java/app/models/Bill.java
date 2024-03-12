package app.models;

import java.sql.Date;

public class Bill {
	private long idBill;
	private Pet idPet;
	private Person idOwner;
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
	
	public Pet getIdPet() {
		return idPet;
	}
	
	public void setIdPet(Pet idPet) {
		this.idPet = idPet;
	}
	
	public Person getidOwner() {
		return idOwner;
	}
	
	public void setidOwner(Person idOwner) {
		this.idOwner = idOwner;
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
