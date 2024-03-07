package app.dao;

import app.config.MYSQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PersonDaoImp implements PersonDao{
	public Connection connection = MYSQLConnection.getConnection();
	
	public void createPerson(PersonDao personDao) throws Exception {
		String query = "INSERT INTO PERSONA(ID, FULLNAME, ROL, AGE) VALUES(?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i=1;
		preparedStatement.setLong(i++, personDao.getId());
		preparedStatement.setString(i++, personDao.getFullName());
		preparedStatement.setString(i++, personDao.getRol());
		preparedStatement.setInt(i++, personDao.getage());
		preparedStatement.execute();
		preparedStatement.close();	
	}
}
