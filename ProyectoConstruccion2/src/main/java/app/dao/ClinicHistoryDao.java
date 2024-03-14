package app.dao;

import app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;

}
