package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.models.Pet;
import tdea.construccion2.app.repository.PetRepository;

@Service
public class PetDaoImp implements PetDao{
	@Autowired
	private PetRepository petRepository;
	
	@Override
	public void createPet(PetDto petDto) throws Exception {
		Pet pet = new Pet(petDto);
		petRepository.save(pet);
	}

        @Override
	public boolean findexistById(PetDto petDto) throws Exception {
		return petRepository.existById(petDto.getIdPet());
	}

	public PetDto findPetById(PetDto petDto) throws Exception {
		Pet pet = petRepository.findByidPet(petDto.getIdPet());
		if(pet == null) {
			return null;
		}
		return new PetDto(pet);
		
	}
       
        @Override 
        public boolean existdBynamePet(PetDto petDto) throws Exception{
            return petRepository.existBynamePet(petDto.getNamePet());
        }
        
	@Override
	public PetDto findBynamePet(PetDto petDto) throws Exception {
            Pet pet = petRepository.findBynamePet(petDto.getNamePet());
            if(pet == null) {
		return null;
            }else {
		return new PetDto(pet);
            }
	}

	public PetRepository getPetRepository() {
            return petRepository;
	}

	public void setPetRepository(PetRepository petRepository) {
            this.petRepository = petRepository;
	}
}