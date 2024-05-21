package tdea.construccion2.app.dto;

import java.sql.Date;
import tdea.construccion2.app.models.Bill;

public class BillDto {
	private long idBill;
	private PetDto idPet;
	private PersonDto idOwner;
	private String productName;
	private double price;
	private int quantity;
	private Date date;
	
	public BillDto(Bill bill) {
		this.idBill=bill.getIdBill();
		this.idPet=new PetDto(bill.getIdPet());
		this.idOwner=new PersonDto(bill.getidOwner());
		this.productName=bill.getProductName();
		this.price=bill.getPrice();
		this.quantity=bill.getQuantity();
		this.date=bill.getDate();
	}
	
	public BillDto() {
		// TODO Auto-generated constructor stub
	}

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
		return idOwner;
	}
	
	public void setOwnerId(PersonDto ownerId) {
		this.idOwner = ownerId;
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
