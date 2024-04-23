package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.models.Session;
import tdea.construccion2.app.repository.SessionRepository;

@Service 
public class LoginDaoImp implements LoginDao  {

	@Autowired
	private SessionRepository sessionRepository;
	@Override
	public SessionDto login(PersonDto personDto) throws Exception {
		Session session = new Session();
		session.setUserName(personDto.getUserName());
		session.setUserRoll(personDto.getRol());
		sessionRepository.save(session);
		return new SessionDto(session);
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

	public SessionRepository getSessionRepository() {
		return sessionRepository;
	}

	public void setSessionRepository(SessionRepository sessionRepository) {
		this.sessionRepository = sessionRepository;
	}
}
