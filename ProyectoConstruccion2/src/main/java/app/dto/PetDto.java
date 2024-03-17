package app.dto;

public class PetDto {
	private String namePet;
	private PersonDto owner;
	private int agePet;
	private long idPet;
	private String species;
	private String race;
	private String caracteris;
	private double weight;
	
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
