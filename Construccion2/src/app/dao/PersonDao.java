package app.dao;

import app.dto.PersonDto;

public interface PersonDao {
	public void createPerson(PersonDto personDto) throws Exception;

}
