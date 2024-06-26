package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{
    public Bill findBillByIdBill(long id);
    public boolean existsByIdBill(long bill);
}
