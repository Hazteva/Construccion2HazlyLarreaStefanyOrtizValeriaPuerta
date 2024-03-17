package app.dto;

public class OrderDto {
	private long idOrder;
	private PetDto idPet;
	private PersonDto idOwner;
	private PersonDto idVeterinarian;
	private String medicineName;
	
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
