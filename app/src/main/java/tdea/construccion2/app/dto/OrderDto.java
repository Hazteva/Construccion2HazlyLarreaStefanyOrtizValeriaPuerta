package tdea.construccion2.app.dto;

import tdea.construccion2.app.models.Order;

public class OrderDto {
	private long idOrder;
	private PetDto idPet;
	private PersonDto idOwner;
	private PersonDto idVeterinarian;
	private String medicineName;
	
	public OrderDto(Order order) {
		this.idOrder=order.getIdOrder();
		this.idPet=new PetDto(order.getIdPet());
		this.idOwner=new PersonDto(order.getIdOwner());
		this.idVeterinarian= new PersonDto(order.getIdVeterinarian());
		this.medicineName=order.getMedicineName();
	}
	 
	public OrderDto() {
		// TODO Auto-generated constructor stub
	}

	public long getIdOrder() {
		return idOrder;
	}
	
	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}
	
	public PetDto getIdPet() {
		return idPet;
	}
	
	public void setIdPet(PetDto idPet) {
		this.idPet = idPet;
	}
	
	public PersonDto getIdOwner() {
		return idOwner;
	}
	
	public void setIdOwner(PersonDto idOwner) {
		this.idOwner = idOwner;
	}
	
	public PersonDto getIdVeterinarian() {
		return idVeterinarian;
	}
	
	public void setIdVeterinarian(PersonDto idVeterinarian) {
		this.idVeterinarian = idVeterinarian;
	}
	
	public String getMedicineName() {
		return medicineName;
	}
	
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}	

}
