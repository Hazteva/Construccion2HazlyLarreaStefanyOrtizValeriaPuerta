package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.models.ClinicHistory;

@Repository
public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory, Long> {
	public void createClinicHistory(ClinicHistory clinicHistory);
	public ClinicHistory findClinicHistory(PetDto petDto); 
	
}
