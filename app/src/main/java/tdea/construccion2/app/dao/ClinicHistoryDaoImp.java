package tdea.construccion2.app.dao;


import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.models.ClinicHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.repository.ClinicHistoryRepository;
import tdea.construccion2.app.dao.ClinicHistoryDaoImp;

@Service
public class ClinicHistoryDaoImp implements ClinicHistoryDao{
	@Autowired
	private ClinicHistoryRepository clinicHistoryRepository;
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistory clinicHistory = new ClinicHistory(clinicHistoryDto);
		clinicHistoryRepository.save(clinicHistory);
	}
	 
        @Override
	public boolean existBypet(ClinicHistoryDto clinicHistoryDto) throws Exception {
		return clinicHistoryRepository.existBypet(clinicHistoryDto.getPet().getNamePet());
	}
        
	@Override  
	public ClinicHistoryDto findByPet(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistory clinicHistory = clinicHistoryRepository.findBypet(clinicHistoryDto.getPet().getNamePet());
		if(clinicHistory == null) {
			return null;
		}else {
			return new ClinicHistoryDto(clinicHistory);
		}
	} 

        @Override
	public boolean findexistByidOrder(ClinicHistoryDto clinicHistoryDto) throws Exception {
		return clinicHistoryRepository.existByidOrder(clinicHistoryDto.getIdOrder().getIdOrder());
	}
        
	@Override  
	public ClinicHistoryDto findByidOrder(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistory clinicHistory = clinicHistoryRepository.findByidOrder(clinicHistoryDto.getIdOrder().getIdOrder());
		if(clinicHistory == null) {
			return null;
		}else {
			return new ClinicHistoryDto(clinicHistory);
		}
	} 
        
	public ClinicHistoryRepository getClinicHistoryRepository() {
		return clinicHistoryRepository;
	}

	public void setClinicHistoryRepository(ClinicHistoryRepository clinicHistoryRepository) {
		this.clinicHistoryRepository = clinicHistoryRepository;
	}
	
	
}
