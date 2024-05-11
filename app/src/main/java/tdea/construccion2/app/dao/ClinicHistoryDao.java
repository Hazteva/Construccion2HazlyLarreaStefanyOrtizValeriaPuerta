package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
        public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean existBypet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findByPet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean findexistByidOrder(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findByidOrder(ClinicHistoryDto clinicHistoryDto) throws Exception;  
}
