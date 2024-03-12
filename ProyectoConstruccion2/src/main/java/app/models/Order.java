package app.models;

import java.util.Date;

public class Order {
	private long idOrder;
	private Pet idPet;
	private Person idOwner;
	private Person idVeterinarian;
	private String medicineName;
	private Date generationDate;
	
	public long getIdOrder() {
		return idOrder;
	}
	
	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}
	
	public Pet getIdPet() {
		return idPet;
	}
	
	public void setIdPet(Pet idPet) {
		this.idPet = idPet;
	}
	
	public Person getIdOwner() {
		return idOwner;
	}
	
	public void setIdOwner(Person idOwner) {
		this.idOwner = idOwner;
	}
	
	public Person getIdVeterinarian() {
		return idVeterinarian;
	}
	
	public void setIdVeterinarian(Person idVeterinarian) {
		this.idVeterinarian = idVeterinarian;
	}
	
	public String getMedicineName() {
		return medicineName;
	}
	
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Date getGenerationDate() {
		return generationDate;
	}

	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}	

}
