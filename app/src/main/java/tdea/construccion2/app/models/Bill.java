package tdea.construccion2.app.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.BillDto;

@Entity
@Table(name="factura")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long idBill;
	@ManyToOne
	@JoinColumn(name="mascota")
	private Pet idPet;
	@ManyToOne
	@JoinColumn(name="propietario")
	private Person idOwner;
	@Column(name="producto")
	private String productName;
	@Column(name="valor")
	private double price;
	@Column(name="cantidad")
	private int quantity;
	@Column(name="fecha")
	private Date date;
	 
	public Bill(BillDto billDto) {
		this.idBill=billDto.getIdBill();
		this.productName=billDto.getProductName();
		this.quantity=billDto.getQuantity();
		this.date=billDto.getDate();
		this.idPet=new Pet(billDto.getIdPet());
		this.idOwner=new Person(billDto.getOwnerId());
	}
	
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
