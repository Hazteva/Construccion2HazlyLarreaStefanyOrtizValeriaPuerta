package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.BillDto;

public interface BillDao {
	
	public void createBill(BillDto billDto) throws Exception;
	public boolean findBillExist(BillDto billDto)throws Exception;
	public boolean findBill(BillDto billDto) throws Exception;
}
