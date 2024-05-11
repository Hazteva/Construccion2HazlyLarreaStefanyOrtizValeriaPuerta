package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
        public boolean existBynamePet(String namePet);
	public Pet findBynamePet(String pet);
        public boolean existById(long id);
	public Pet findByidPet(long id);	
	
}
