package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{
    public Bill findBillByIdBill(long id);
    public boolean findBillExistByIdBill(long bill);
    public Bill finBillByIdPet(long id);
    public boolean finBillExistByIdPet(long bill);
}
