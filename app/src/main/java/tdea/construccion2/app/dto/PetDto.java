package tdea.construccion2.app.dto;

import tdea.construccion2.app.models.Pet;

public class PetDto {
	private String namePet;
	private PersonDto owner;
	private int agePet;
	private long idPet;
	private String species;
	private String race;
	private String caracteris;
	private double weight;
	
	public PetDto(Pet pet) {
		this.namePet=pet.getNamePet();
		this.owner=new PersonDto(pet.getOwner());
		this.agePet=pet.getAgePet();
		this.idPet=pet.getIdPet();
		this.race=pet.getRace();
		this.caracteris=pet.getCaracteris();
		this.weight=pet.getWeight();
	}
	  
	public PetDto() {
		// TODO Auto-generated constructor stub
	}

	public String getNamePet() {
		return namePet;
	}
	
	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}
	
	public PersonDto getOwner() {
		return owner;
	}

	public void setOwner(PersonDto owner) {
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
