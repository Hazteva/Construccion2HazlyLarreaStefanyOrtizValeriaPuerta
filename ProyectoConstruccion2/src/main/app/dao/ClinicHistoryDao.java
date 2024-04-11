package app.dao;

import app.dto.BillDto;
import app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public boolean findBillById(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public BillDto findClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
}
