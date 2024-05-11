package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    public Order findOrderByIdOrder(long id);
    public boolean findOrderExistByIdOrder(long orderDto);
    public Order findOrderByIdPet(long id);
    public boolean findOrderExistByIdPet(long orderDto);
}
