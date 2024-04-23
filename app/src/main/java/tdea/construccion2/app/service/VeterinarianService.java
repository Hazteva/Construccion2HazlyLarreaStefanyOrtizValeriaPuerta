package tdea.construccion2.app.service;

import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetDto;

public interface VeterinarianService {
	public void createOwner (PersonDto personDto) throws Exception;
	public void createPet (PetDto petDto) throws Exception;
	public void createClinicHistory (ClinicHistoryDto clinicHistoryDto) throws Exception;
	public void createOrder (OrderDto orderDto) throws Exception;
}
