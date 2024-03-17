package app.service;

import java.util.List; 
import java.util.Arrays;
import app.dao.LoginDao;
import app.dao.LoginDaoImp;
import app.dao.PersonDao;
import app.dao.PersonDaoImp;
import app.dao.PetDao;
import app.dao.PetDaoImp;
import app.dao.BillDao;
import app.dao.BillDaoImp;
import app.dao.ClinicHistoryDao;
import app.dao.ClinicHistoryDaoImp;
import app.dto.BillDto;
import app.dto.ClinicHistoryDto;
import app.dto.OrderDto;
import app.dto.PersonDto;
import app.dto.PetDto;
import app.dto.SessionDto;


public class VetService implements AdministratorService, VeterinarianService, SellerService, LoginService, OrderService{
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
	
	@Override
	public void setSesionID(long sesionId) {
		sessionId = sesionId;
	}

	@Override
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

	@Override
	public void logout() throws Exception {
		LoginDao loginDao = new LoginDaoImp();
		loginDao.logout(sessionId);
		setSesionID(0);
	}

	@Override
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
	
	@Override
	public void createPet(PetDto petdto) throws Exception{
		PetDao petDao = new PetDaoImp();
		if (petDao.findPetExist(petdto)) {
			throw new Exception("Ya existe una mascota con esa id");
		}
		if (petDao.findPetById(petdto)) {
			throw new Exception("Ya existe la mascota");
		}
		petDao.createPet(petdto);
		System.out.println("Se ha creado la mascota correctamente");	
	}
	
	@Override
	public void createBill(BillDto billDto)throws Exception{
		BillDao billDao = new BillDaoImp();
		if(billDao.findBillExist(billDto)) {
			throw new Exception("Ya esxiste la factura");
		}
		if(billDao.findBill(billDto)) {
			throw new Exception("Ya existe una factura con esa id");
		}
		billDao.createBill(billDto);
		System.out.println("Se ha creado la factura correctamente");
	}
	
	@Override
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistoryDao clinicHistoryDao = (ClinicHistoryDao) new ClinicHistoryDaoImp();
		if(clinicHistoryDao.findBillById(clinicHistoryDto)) {
			throw new Exception("Ya está la historia clinica");
		}
		clinicHistoryDao.createClinicHistory(clinicHistoryDto);
		System.out.print("Se ha creado la historia clinica correctamente");
	}

	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
		OrderDao orderDao = new OrderDaoImp();
	}
}


