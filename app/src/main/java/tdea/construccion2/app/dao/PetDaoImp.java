package tdea.construccion2.app.dao;

import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PetDto;

@Service
public class PetDaoImp implements PetDao{
	
	public void createPet(PetDto petDto) throws Exception {
	}

	public boolean findPetExist(PetDto petDto) throws Exception {
		return true;
	}

	public PetDto findPetById(PetDto petDto) throws Exception {
		return null;
	}
	
	@Override
	public boolean findPet(PetDto petDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}