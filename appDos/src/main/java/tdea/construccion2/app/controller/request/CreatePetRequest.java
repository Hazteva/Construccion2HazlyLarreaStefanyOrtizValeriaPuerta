package tdea.construccion2.app.controller.request;

import org.antlr.v4.runtime.misc.NotNull;

public class CreatePetRequest {
    @NotNull
    private String namePet;
    @NotNull
    private String owner;
    @NotNull
    private String agePet;
    @NotNull
    private String idPet;
    @NotNull
    private String species;
    @NotNull
    private String race;
    @NotNull
    private String caracteris;
    @NotNull
    private String weight;
    
    public CreatePetRequest(){
    
    } 

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAgePet() {
        return agePet;
    }

    public void setAgePet(String agePet) {
        this.agePet = agePet;
    }

    public String getIdPet() {
        return idPet;
    }

    public void setIdPet(String idPet) {
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    
}
