package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import app.config.MYSQLConnection;
import app.dto.OrderDto;

public class OrderDaoImp {
	public Connection connection = MYSQLConnection.getConnection();
	
	public void createOrder(OrderDto orderDto) throws Exception {
		String query = "INSERT INTO PERSONA(IDORDEN,IDMASCORA,IDDUEÑO,IDVETERINARIO,NOMBREMEDICINA) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setLong(i++, orderDto.getIdOrder());
		preparedStatement.setLong(i++, orderDto.getIdPet().getIdPet());
		preparedStatement.setLong(i++, orderDto.getIdOwner().getId());
		preparedStatement.setLong(i++, orderDto.getIdVeterinarian().getId());
		preparedStatement.setString(i++, orderDto.getMedicineName());
		preparedStatement.execute();
		preparedStatement.close();	
	}

}
