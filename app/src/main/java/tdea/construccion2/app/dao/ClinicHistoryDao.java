package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.BillDto;
import tdea.construccion2.app.dto.ClinicHistoryDto;

public interface ClinicHistoryDao {
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public boolean findBillById(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public BillDto findClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
}
