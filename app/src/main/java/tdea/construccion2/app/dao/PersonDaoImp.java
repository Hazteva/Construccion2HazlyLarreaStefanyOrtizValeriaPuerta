package tdea.construccion2.app.dao;

import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PersonDto;

@Service
public class PersonDaoImp implements PersonDao{
	
	@Override
	public void createPerson(PersonDto personDto) throws Exception {
	}

	@Override
	public boolean findUserExist(PersonDto personDto) throws Exception {
		return true;
	}

	@Override
	public PersonDto findUserById(PersonDto personDto) throws Exception {
		return null;
	}

	@Override
	public boolean existUserByUserName(PersonDto personDto) throws Exception {
		return true;
	}

	@Override
	public PersonDto findUserByUserName(PersonDto personDto) throws Exception {
		return null;
	}
}
