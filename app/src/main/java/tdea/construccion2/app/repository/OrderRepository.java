package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	public boolean findOrderExist(long orderDto);
	public Order findOrderById(long id);
}
