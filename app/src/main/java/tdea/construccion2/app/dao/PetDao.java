package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PetDto;

public interface PetDao {
	public void createPet(PetDto petDto) throws Exception;
	public boolean existByNamePet(PetDto petDto) throws Exception;
	public PetDto findByNamePet(PetDto petDto) throws Exception;
        public boolean findExistById(PetDto petDto) throws Exception;
        public PetDto findPetById(PetDto petDto) throws Exception;
}
