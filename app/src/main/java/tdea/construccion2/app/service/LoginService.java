package tdea.construccion2.app.service;

import tdea.construccion2.app.dto.PersonDto;

public interface LoginService {
	
	public void setSesionID(long sesionId);
	public void login(PersonDto personDto)throws Exception;	
	public void logout() throws Exception;
}
