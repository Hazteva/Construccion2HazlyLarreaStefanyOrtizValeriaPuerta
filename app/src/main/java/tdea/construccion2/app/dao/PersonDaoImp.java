package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.models.Person;
import tdea.construccion2.app.repository.PersonRepository;

@Service
public class PersonDaoImp implements PersonDao{
	@Autowired
	private PersonRepository personRepository;
	
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
		Person person = personRepository.findByUserName(personDto.getUserName());
		if(person == null) {
			return null;
		}else {
			return new PersonDto(person);
		}
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	
}
