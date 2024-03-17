package app.service;

import app.dto.PersonDto;

public interface LoginService {
	
	public void setSesionID(long sesionId);
	public void login(PersonDto personDto)throws Exception;	
	public void logout() throws Exception;
}
