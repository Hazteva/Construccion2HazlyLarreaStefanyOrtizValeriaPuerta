package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.models.Order;
import tdea.construccion2.app.models.Pet;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    public Order findOrderById(long id);
    public boolean existsById(long orderDto);
    public Order findOrderByIdPet(Pet pet);
    public boolean existsByIdPet(Pet pet);
}
