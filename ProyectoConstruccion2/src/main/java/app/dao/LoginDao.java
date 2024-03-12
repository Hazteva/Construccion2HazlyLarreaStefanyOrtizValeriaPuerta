package app.dao;

import app.dto.PersonDto;
import app.dto.SessionDto;

public interface LoginDao {
	
	public SessionDto login(PersonDto personDto) throws Exception;
	public SessionDto findSessionById(long sessionId) throws Exception;
	public void logout(long sessionId) throws Exception;

}
