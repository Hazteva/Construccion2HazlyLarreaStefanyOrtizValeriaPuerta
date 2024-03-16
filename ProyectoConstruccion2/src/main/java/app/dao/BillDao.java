package app.dao;

import app.dto.BillDto;

public interface BillDao {
	
	public void createBill(BillDto billDto) throws Exception;
	public boolean findBillExist(BillDto billDto)throws Exception;
	public BillDto findBillById(BillDto billDto) throws Exception;
}
