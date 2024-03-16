package app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.config.MYSQLConnection;
import app.dto.BillDto;
import app.dto.PersonDto;
import app.dto.PetDto;

public class BillDaoImp implements BillDao {
	public Connection connection = MYSQLConnection.getConnection();

	public void createBill(BillDto billDto) throws Exception {
		String query = "INSERT INTO FACTURA(ID,MASCOTA,PROPIETARIO,PRODUCTO,VALOR,CANTIDAD,FECHA) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		
		preparedStatement.setLong(i++, billDto.getIdBill());
	    preparedStatement.setLong(i++, billDto.getIdPet().getIdPet());
		preparedStatement.setLong(i++, billDto.getOwnerId().getId());
		preparedStatement.setString(i++, billDto.getProductName());
		preparedStatement.setDouble(i++, billDto.getPrice());
		preparedStatement.setInt(i++, billDto.getQuantity());
		preparedStatement.setDate(i++, billDto.getDate());
		preparedStatement.execute();
		preparedStatement.close();
	}
		
	public boolean findBillExist(BillDto billDto) throws Exception{
		String query = "SELECT 1 FROM FACTURA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setLong(1, billDto.getIdBill());
		ResultSet resultSet = preparedStatement.executeQuery();
		boolean billExists = resultSet.next();
		resultSet.close();
		preparedStatement.close();
		
		return billExists;
	}
	
	
	public BillDto findBillById(BillDto billDto) throws Exception {
		String query = "SELECT ID,MASCOTA,PROPIETARIO,PRODUCTO,VALOR,CANTIDAD,FECHA FROM FACTURA WHERE ID = ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setLong(1, billDto.getIdBill());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			BillDto bill = new BillDto();
			bill.setIdBill(resultSet.getLong("ID_BILL"));
			
			PetDto petDto = new PetDto();
			petDto.setIdPet(resultSet.getLong("ID_PET"));
			bill.setIdPet(petDto);
			
			PersonDto personDto = new PersonDto();
			personDto.setId(resultSet.getLong("OWNER_ID"));
			bill.setOwnerId(personDto);
			
			bill.setProductName(resultSet.getString("PRODUCT_NAME"));
			bill.setPrice(resultSet.getDouble("PRICE"));
			bill.setQuantity(resultSet.getInt("QUANTITY"));
			bill.setDate(resultSet.getDate("DATE"));
			
			resultSet.close();
			preparedStatement.close();
			return new BillDto();
		}
		resultSet.close();
		preparedStatement.close();
		
		return null;
	}
}
