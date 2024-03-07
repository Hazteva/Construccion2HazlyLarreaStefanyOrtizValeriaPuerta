package app.service;

import app.dto.PersonDto;
import java.util.List;
import java.util.Arrays;
import app.dto.UserNameDto;

public class VetService implements AdministratorService, VeterinarianService{

	@Override
	public void createUser(UserNameDto userNameDto) throws Exception {
		UserNameDao userNameDao = new UserNameDaoImpl();
		if(UserNameDao.findUserExist(UserNameDto)) {
			throws new Exception("Ya existe un usuario con esa cédula");
		}
		
	}

	
	private static final String[]rolls = {"Administrador", "Veterinario", "Vendedor", "Dueño", "Mascota" };
		@Override
		public void createOwner(PersonDto personDto) throws Exception {
			List<String> rols = Arrays.asList(rolls);
			if(rols.contains(personDto.getRol())) {
				throw new Exception("El rol no es valido");
			}	
	    }
    }
		
	public void login(PersonDto personDto) throws Exception{
		PersonDao personDao =  new PersonDao;
		
	}
		
}


