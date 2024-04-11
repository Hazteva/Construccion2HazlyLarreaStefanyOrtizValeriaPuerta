package app.service;

import app.dto.BillDto;

public interface BillService {
	
	public void createBill (BillDto billDto) throws Exception;

}
