package tdea.construccion2.app.dao;


import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.OrderDto;

@Service
public class OrderDaoImp implements OrderDao {
	
	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
	}

	@Override
	public boolean findOrderExist(OrderDto orderDto) throws Exception {
		return true;
	}

	@Override
	public OrderDto findOrderPet(OrderDto orderDto) throws Exception {
		return null;
		
	}
	
	@Override
	public OrderDto findOrderOwner(OrderDto orderDto) throws Exception {
		return null;
		
	}
	
	@Override
	public OrderDto findOrderVeterinarian(OrderDto orderDto) throws Exception {
		return null;
		
	}

	
	
}
