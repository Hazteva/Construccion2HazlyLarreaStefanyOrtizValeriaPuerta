package app.dao;

import app.dto.UserNameDto;

public interface UserNameDao {
	public void createUser(UserNameDto userNameDto) throws Exception;
	public boolean findUserExist(UserNameDto userNameDto) throws Exception;
	public UserNameDto finUser(UserNameDto personDto) throws Exception; 

}
