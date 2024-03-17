package app.service;

import app.dto.BillDto;

public interface SellerService {
	public void createBill (BillDto billDto) throws Exception;
}
