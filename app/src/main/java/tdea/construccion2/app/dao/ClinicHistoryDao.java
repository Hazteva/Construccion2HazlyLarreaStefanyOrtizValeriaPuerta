package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public void findClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;

}
