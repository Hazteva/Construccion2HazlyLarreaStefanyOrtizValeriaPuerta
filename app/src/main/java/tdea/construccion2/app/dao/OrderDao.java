package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.OrderDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
	public boolean findOrderExist(OrderDto orderDto) throws Exception;
	public boolean findOrder(OrderDto orderDto) throws Exception;
}
