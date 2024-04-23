package tdea.construccion2.app.dao;

import org.springframework.stereotype.Service;


import tdea.construccion2.app.dto.BillDto;

@Service
public class BillDaoImp implements BillDao{
	@Override
	public void createBill(BillDto billDto) throws Exception {
		
	}
	@Override	
	public boolean findBillExist(BillDto billDto) throws Exception{
		return true;
	}
	
	public BillDto findBillById(BillDto billDto) throws Exception {	
		return null;
	}

	@Override
	public boolean findBill(BillDto billDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
