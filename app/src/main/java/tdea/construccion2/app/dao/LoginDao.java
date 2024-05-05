package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.SessionDto;

public interface LoginDao {
	
	public SessionDto login(PersonDto personDto) throws Exception;
	public SessionDto findSessionById(long sessionId) throws Exception;
	public void logout(long sessionId) throws Exception;
	public void delectRouter(PersonDto personDto) throws Exception;
 
}
