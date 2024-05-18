package tdea.construccion2.app.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.OrderDto;

@Entity
@Table(name="orden")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@ManyToOne
	@JoinColumn(name="mascota")
	private Pet idPet;
	@ManyToOne
	@JoinColumn(name="propietario")
	private Person idOwner;
	@ManyToOne
	@JoinColumn(name="medico")
	private Person idVeterinarian;
	@Column(name="medicamento")
	private String medicineName;
	@Column(name="fecha")
	private Date generationDate;
	
	public Order(OrderDto orderDto) {
		this.id=orderDto.getIdOrder();
		this.idPet= new Pet(orderDto.getIdPet());
		this.idOwner=new Person(orderDto.getIdOwner());
		this.medicineName=orderDto.getMedicineName();
	}
	
        public Order(){
        
        }
        
	public long getIdOrder() {
		return id;
	}
	
	public void setIdOrder(long idOrder) {
		this.id = idOrder;
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
