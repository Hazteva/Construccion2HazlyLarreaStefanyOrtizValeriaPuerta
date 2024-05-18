package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PetDto;

public interface PetDao {
	public void createPet(PetDto petDto) throws Exception;
	public boolean existsByNamePet(PetDto petDto) throws Exception;
	public PetDto findByNamePet(PetDto petDto) throws Exception;
        public boolean existsByIdPet(PetDto petDto) throws Exception;
        public PetDto findByIdPet(PetDto petDto) throws Exception;
}
