package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.models.Order;
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
        public OrderDto findOrderByIdOrder(OrderDto orderDto) throws Exception {
            Order order = orderRepository.findOrderByIdOrder(orderDto.getIdOrder());
            if(order == null) {
		return null;
            }else {
		return new OrderDto(order);
            }
	}
        
        @Override
	public boolean findOrderExistByIdOrder(OrderDto orderDto) throws Exception {
            return orderRepository.findOrderExistByIdOrder(orderDto.getIdPet().getIdPet());
	}
        
        @Override
        public OrderDto findOrderByIdPet(OrderDto orderDto) throws Exception {
            Order order = orderRepository.findOrderByIdPet(orderDto.getIdPet().getIdPet());
            if(order == null) {
                return null;
            }else {
		return new OrderDto(order);
            }
	}
        
        @Override
	public boolean findOrderExistByIdPet(OrderDto orderDto) throws Exception {
            return orderRepository.findOrderExistByIdPet(orderDto.getIdOrder());
	}
        
	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
}
