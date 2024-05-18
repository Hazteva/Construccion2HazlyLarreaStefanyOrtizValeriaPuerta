package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
        public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean existsByPet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findByPet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean existsById(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findById(ClinicHistoryDto clinicHistoryDto) throws Exception;  
}
