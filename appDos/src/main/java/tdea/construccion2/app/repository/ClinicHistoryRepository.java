package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.models.ClinicHistory;
import tdea.construccion2.app.models.Pet;

@Repository
public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory, Long> {
	public boolean existsByPet(Pet pet);
        public ClinicHistory findByPet(Pet pet);
        public boolean existsById(long id);
        public ClinicHistory findById(long id);
}
