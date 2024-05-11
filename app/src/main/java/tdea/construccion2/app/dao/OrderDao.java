package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.OrderDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
        public OrderDto findOrderByIdOrder(OrderDto orderDto) throws Exception;
	public boolean findOrderExistByIdOrder(OrderDto orderDto) throws Exception;
        public OrderDto findOrderByIdPet (OrderDto orderDto) throws Exception;
	public boolean findOrderExistByIdPet(OrderDto orderDto) throws Exception;
}
