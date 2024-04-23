package tdea.construccion2.app.dao;

import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.SessionDto;

@Service
public class LoginDaoImp implements LoginDao  {

	@Override
	public SessionDto login(PersonDto personDto) throws Exception {
		return null;
	}

	@Override
	public void logout(long sessionId) throws Exception {
	}

	@Override
	public SessionDto findSessionById(long sessionId)throws Exception {
		return null;
	}

	@Override
	public void delectRouter(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
