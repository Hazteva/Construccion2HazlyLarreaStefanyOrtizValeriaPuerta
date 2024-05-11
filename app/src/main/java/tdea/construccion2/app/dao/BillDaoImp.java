package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.BillDto;
import tdea.construccion2.app.models.Bill;
import tdea.construccion2.app.repository.BillRepository;

@Service
public class BillDaoImp implements BillDao{
	
	@Autowired
	private BillRepository billRepository;

	
	@Override
	public void createBill(BillDto billDto) throws Exception {
		Bill bill = new Bill(billDto);
		billRepository.save(bill);
	}
	
	public BillDto findBillByidBill(BillDto billDto) throws Exception {	
		Bill bill = billRepository.findBillById(billDto.getIdBill());
		if(bill == null) {
			return null;
		}else {
			return new BillDto(bill);
		}
	}

	@Override
	public boolean findBillExist(BillDto billDto) throws Exception {
		return billRepository.findBillExist(billDto.getIdBill());
	}

        public BillDto findBill(BillDto billDto) throws Exception {
            Bill bill = billRepository.findBill(billDto.getIdBill());
            if(bill == null){
                return null;
            }else{
                return new BillDto(bill);
            }        
        }
        
	public BillRepository getBillRepository() {
		return billRepository;
	}

	public void setBillRepository(BillRepository billRepository) {
		this.billRepository = billRepository;
	}
}
