package app.dao;

import app.dto.PetDto;

public interface PetDao {
	
	public void createPet(PetDto petDto) throws Exception;
	public boolean findPetExist(PetDto petDto) throws Exception;
	public boolean findPet(PetDto petDto) throws Exception;
}
