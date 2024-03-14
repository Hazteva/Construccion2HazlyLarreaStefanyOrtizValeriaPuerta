package app.dao;

import app.dto.BillDto;

public interface BillDao {
	
	public void createBill(BillDto billDto) throws Exception;
	
	
}
