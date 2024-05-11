package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.BillDto;

public interface BillDao {
	
	public void createBill(BillDto billDto) throws Exception;
        public BillDto findBillByIdBill(BillDto billDto) throws Exception;
	public boolean findBillExistByIdBill(BillDto billDto)throws Exception;
	public BillDto finBillByIdPet(BillDto billDto) throws Exception;
        public boolean finBillExistByIdPet(BillDto billDto)throws Exception;
}
