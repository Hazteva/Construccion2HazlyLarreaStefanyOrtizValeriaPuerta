package app.service;

import java.util.List; 
import java.util.Arrays;
import app.dao.LoginDao;
import app.dao.LoginDaoImp;
import app.dao.PersonDao;
import app.dao.PersonDaoImp;
import app.dto.BillDto;
import app.dto.ClinicHistoryDto;
import app.dto.PersonDto;
import app.dto.SessionDto;


public class VetService implements AdministratorService, VeterinarianService, SellerService{
	List<String> roles = Arrays.asList("Administrador", "Veterinario", "Vendedor", "Dueño", "Mascota");
	private static long sessionId = 0L;

	@Override
	public void createUser(PersonDto personDto) throws Exception {
		if (!roles.contains(personDto.getRol())) {
			throw new Exception("El rol no es valido");
		}
		PersonDao personDao = new PersonDaoImp();
		if (personDao.findUserExist(personDto)) {
			throw new Exception("Ya existe un usuario con esa cédula");
		}
		if (personDao.existUserByUserName(personDto)) {
			throw new Exception("Ya existe el usuario");
		}
		personDao.createPerson(personDto);
		System.out.println("Se ha creado el usuario correctamente");
	}
	
	public void setSesionID(long sesionId) {
		sessionId = sesionId;
	}

	public void login(PersonDto personDto) throws Exception {
		PersonDao personDao = new PersonDaoImp();
		PersonDto personDtoValidate = personDao.findUserByUserName(personDto);
		if (personDtoValidate == null) {
			throw new Exception("El Usuario no valido");
		}
		if (!personDto.getPassword().equals(personDtoValidate.getPassword())) {
			throw new Exception("usuario o contraseña incorrectos");
		}
		personDto.setRol(personDtoValidate.getRol());
		LoginDao loginDao = new LoginDaoImp();
		SessionDto sesionDto = loginDao.login(personDtoValidate);
		setSesionID(sesionDto.getId());
		System.out.println("Se inicia la sesion " + sessionId);
	}

	public void logout() throws Exception {
		LoginDao loginDao = new LoginDaoImp();
		loginDao.logout(sessionId);
		setSesionID(0);
	}

	public void createOwner(PersonDto personDto) throws Exception {
		PersonDao personDao = new PersonDaoImp();
		if (personDao.findUserExist(personDto)) {
			throw new Exception("Ya existe un usuario con esa cédula");
		}
		if (personDao.existUserByUserName(personDto)) {
			throw new Exception("Ya existe el usuario");
		}
		personDao.createPerson(personDto);
		System.out.println("Se ha creado el usuario correctamente");
	}
	
	public void createBill(BillDto billDto)throws Exception{
	}
	
	public void createHistoryClinic(ClinicHistoryDto clinicHistoryDto) throws Exception {
		
	}
}


