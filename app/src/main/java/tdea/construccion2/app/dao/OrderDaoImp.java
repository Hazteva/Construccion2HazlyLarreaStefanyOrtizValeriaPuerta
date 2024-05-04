package tdea.construccion2.app.dao;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.models.Order;
import tdea.construccion2.app.repository.OrderRepository;

@Service
public class OrderDaoImp{
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void createOrder(OrderDto orderDto) throws Exception {
            Order order = new Order(orderDto);
            orderRepository.save(order);
            orderDto.setIdOrder(order.getIdOrder());
	}
	
	
	public boolean findOrderExist(OrderDto orderDto) throws Exception {
            return orderRepository.findOrderExist(orderDto.getIdOrder());
	}

	public OrderDto findOrderById(OrderDto orderDto) throws Exception {
            Order order = orderRepository.findOrderById(orderDto.getIdOrder());
            if(order == null) {
		return null;
            }else {
		return new OrderDto(order);
            }
	}
	
	public OrderRepository getOrderRepository() {
		return orderRepository;
	}


	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

}
