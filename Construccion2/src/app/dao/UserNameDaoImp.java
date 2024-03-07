package app.dao;

import app.config.MYSQLConnection;
import app.dto.UserNameDto;
import app.models.UserName;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserNameDaoImp implements UserNameDao{
	public Connection connection = MYSQLConnection.getConnection();
			
	public void createUser(UserNameDao userNameDao) throws Exception {
		String query = "INSERT INTO PERSONA(USERNAME, PASSWORD) VALUES(?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i=1;
		preparedStatement.setString(i++, UserNameDto.getUserName);
		preparedStatement.setString(i++, UserNameDto.getPassword());
		preparedStatement.execute();
		preparedStatement.close();	
	}
	
	@Override
	public boolean findUserExist(UserNameDto userNameDto) throws Exception{
		String query = "SELECT 1 FROM PERSONA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userNameDto.getUserName());
		ResultSet resultSet = preparedStatement.executeQuery();
		boolean userExists = resulSet.next();
		resulSet.close();
		preparedStatement.close();
		return userExists;
	}
	 
	@Override
	public UserNameDto finUser(UserNameDto userNameDto ){
		String query = "SELECT USERNAME, PASSWORD FROM PERSONA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userNameDto.getUserName());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			UserName userName = new UserName();
			UserName.setUserName(resulSet.getString("USERNAME"));
			UserName.setPassword(resulSet.getString("PASSWORD"));
			resulSet.close();
			return new UserNameDto(UserName);	
		}
		resulSet.close();
		preparedStatement.close();
		return null;
	}
	

}
