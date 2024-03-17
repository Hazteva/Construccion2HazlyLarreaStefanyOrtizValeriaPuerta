package app.service;

import app.dto.OrderDto;

public interface OrderService {
	public void createOrder (OrderDto oderDto) throws Exception;

}
