package tdea.construccion2.app.service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.BillDto;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;
import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.dao.PersonDao;
import tdea.construccion2.app.dao.LoginDao;
import tdea.construccion2.app.dao.PetDao;
import tdea.construccion2.app.dao.BillDao;
import tdea.construccion2.app.dao.ClinicHistoryDao;
import tdea.construccion2.app.dao.OrderDao;

@Service
public class VetService implements AdministratorService, VeterinarianService, SellerService, LoginService, OrderService, BillService {

    List<String> roles = Arrays.asList("Administrador", "Veterinario", "Vendedor", "Dueño", "Mascota");
    private static long sessionId = 0L;

    @Autowired
    private PersonDao personDao;
    @Autowired
    private LoginDao loginDao;
    @Autowired
    private PetDao petDao;
    @Autowired
    private BillDao billDao;
    @Autowired
    private ClinicHistoryDao clinicHistoryDao;
    @Autowired
    private OrderDao orderDao;

    @Override
    public void createUser(PersonDto personDto) throws Exception {
        if (!roles.contains(personDto.getRol())) {
            throw new Exception("El rol no es valido");
        }
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
        PersonDto personDtoValidate = personDao.findUserByUserName(personDto);
        if (personDtoValidate == null) {
            throw new Exception("El Usuario no valido");
        }
        if (!personDto.getPassword().equals(personDtoValidate.getPassword())) {
            throw new Exception("Usuario o contraseña incorrectos");
        }
        personDto.setRol(personDtoValidate.getRol());
        SessionDto sesionDto = loginDao.login(personDtoValidate);
        setSesionID(sesionDto.getId());
        System.out.println("Se inicia la sesion " + sessionId);
    }

    @Override
    public void logout() throws Exception {
        loginDao.logout(sessionId);
        setSesionID(0);
    }

    @Override
    public void createOwner(PersonDto personDto) throws Exception {
        if (personDao.findUserExist(personDto)) {
            throw new Exception("Ya existe un dueño con esa cédula");
        }
        personDao.createPerson(personDto);
        System.out.println("Se ha creado el dueño correctamente");
    }

    @Override
    public void createPet(PetDto petDto) throws Exception {

        if (!personDao.findUserExist(petDto.getOwner())) {
            throw new Exception("No existe un dueño");
        }
        petDao.createPet(petDto);
        System.out.println("Se ha creado la mascota correctamente");

    }

    @Override
    public void createBill(BillDto billDto) throws Exception {
        PetDto petDto = petDao.findByIdPet(billDto.getIdPet());
        if (petDto == null) {

            throw new Exception("mascota nula");
        }
        billDto.setIdPet(petDto);
        billDto.setOwnerId(petDto.getOwner());
        billDto.setDate(billDto.getDate());
        billDao.createBill(billDto);
        System.out.println("Se ha creado la factura correctamente");
    }

    @Override
    public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
        SessionDto sessionDto = loginDao.findSessionById(sessionId);
        PersonDto personDto = new PersonDto();
        personDto.setUserName(sessionDto.getUserName());
        personDto = personDao.findUserByUserName(personDto);

        PetDto petDto = petDao.findByIdPet(clinicHistoryDto.getPet());
        if (petDto == null) {

            throw new Exception("mascota nula");
        }

        personDto = personDao.findUserByUserName(personDto);
        clinicHistoryDto.setVeterinarian(personDto);
       /* if (!petDao.existsByIdPet(clinicHistoryDto.getPet())) {
            throw new Exception("no existe la mascota");
        }*/
        /* PetDto petDto = new PetDto();*/
        OrderDto orderDto = new OrderDto();
        orderDto.setIdPet(petDto);
        orderDto.setIdOwner(petDto.getOwner());
        orderDto.setIdVeterinarian(personDto);
        orderDto.setMedicineName(clinicHistoryDto.getMedicines());
        orderDto.setDate(new Date(clinicHistoryDto.getDate()));
        createOrder(orderDto);
        clinicHistoryDto.setIdOrder(orderDto);
        clinicHistoryDto.setPet(petDto);
        clinicHistoryDto.setVeterinarian(personDto);
        clinicHistoryDao.createClinicHistory(clinicHistoryDto);
        System.out.print("Se ha creado la historia clinica correctamente  ");
    }

    @Override
    public void createOrder(OrderDto orderDto) throws Exception {
        orderDao.createOrder(orderDto);
        System.out.print("Y se ha creado la orden correctamente");
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public PetDao getPetDao() {
        return petDao;
    }

    public void setPetDao(PetDao petDao) {
        this.petDao = petDao;
    }

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }

    public ClinicHistoryDao getClinicHistoryDao() {
        return clinicHistoryDao;
    }

    public void setClinicHistoryDao(ClinicHistoryDao clinicHistoryDao) {
        this.clinicHistoryDao = clinicHistoryDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

}
