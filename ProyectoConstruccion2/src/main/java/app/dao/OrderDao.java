package app.dao;

import app.dto.OrderDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
}
