package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.OrderDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
        public OrderDto findOrderById(OrderDto orderDto) throws Exception;
	public boolean existsById(OrderDto orderDto) throws Exception;
        public OrderDto findOrderByIdPet (OrderDto orderDto) throws Exception;
	public boolean existsByIdPet(OrderDto orderDto) throws Exception;
}
