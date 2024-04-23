package tdea.construccion2.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.PetDto;

@Entity
@Table(name="mascota")
public class Pet {
	@Id
	@Column(name="nombre")
	private String namePet;
	@ManyToOne
	@JoinColumn(name="propietario")
	private Person owner;
	@Column(name="edad")
	private int agePet;
	@Column(name="id")
	private long idPet;
	@Column(name="especie")
	private String species;
	@Column(name="raza")
	private String race;
	@Column(name="caracteristicas")
	private String caracteris;
	@Column(name="peso")
	private double weight;
	
	public Pet(PetDto petDto) {
		this.namePet=petDto.getNamePet();
		this.owner=new Person(petDto.getOwner());
		this.agePet=petDto.getAgePet();
		this.idPet=petDto.getIdPet();
		this.species=petDto.getSpecies();
		this.race=petDto.getRace();
		this.caracteris=petDto.getCaracteris();
		this.weight=petDto.getWeight();
	}
	
	public String getNamePet() {
		return namePet;
	}
	
	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}
	
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public int getAgePet() {
		return agePet;
	}
	
	public void setAgePet(int agePet) {
		this.agePet = agePet;
	}
	
	public long getIdPet() {
		return idPet;
	}
	
	public void setIdPet(long idPet) {
		this.idPet = idPet;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String getCaracteris() {
		return caracteris;
	}
	
	public void setCaracteris(String caracteris) {
		this.caracteris = caracteris;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
