package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.models.Order;
import tdea.construccion2.app.models.Pet;
import tdea.construccion2.app.repository.OrderRepository;

@Service
public class OrderDaoImp implements OrderDao{
	
	@Autowired
	private OrderRepository orderRepository;
	
        @Override
	public void createOrder(OrderDto orderDto) throws Exception {
            Order order = new Order(orderDto);
            orderRepository.save(order);
            orderDto.setIdOrder(order.getIdOrder());
	}
	
        @Override
        public OrderDto findOrderById(OrderDto orderDto) throws Exception {
            Order order = orderRepository.findOrderById(orderDto.getIdOrder());
            if(order == null) {
		return null;
            }else {
		return new OrderDto(order);
            }
	}
        
        @Override
	public boolean existsById(OrderDto orderDto) throws Exception {
            return orderRepository.existsById(orderDto.getIdPet().getIdPet());
	}
        
        @Override
        public OrderDto findOrderByIdPet(OrderDto orderDto) throws Exception {
            Order order = orderRepository.findOrderByIdPet( new Pet(orderDto.getIdPet()));
            if(order == null) {
                return null;
            }else {
		return new OrderDto(order);
            }
	}
        
        @Override
	public boolean existsByIdPet(OrderDto orderDto) throws Exception {
            return orderRepository.existsByIdPet(new Pet(orderDto.getIdPet()));
	}
        
	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
}
