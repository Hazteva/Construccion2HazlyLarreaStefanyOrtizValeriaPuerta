package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
        public boolean existsPetByNamePet(String namePet);
	public Pet findByNamePet(String pet);
        public boolean existsByIdPet(long id);
	public Pet findByIdPet(long id);	
}
