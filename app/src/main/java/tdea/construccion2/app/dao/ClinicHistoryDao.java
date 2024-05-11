package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
        public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean existByPet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findByPet(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public boolean findExistByIdOrder(ClinicHistoryDto clinicHistoryDto) throws Exception;
        public ClinicHistoryDto findByIdOrder(ClinicHistoryDto clinicHistoryDto) throws Exception;  
}
