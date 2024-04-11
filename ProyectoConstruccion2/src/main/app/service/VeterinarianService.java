package app.service;

import app.dto.PersonDto;
import app.dto.PetDto;
import app.dto.ClinicHistoryDto;
import app.dto.OrderDto;

public interface VeterinarianService {
	public void createOwner (PersonDto personDto) throws Exception;
	public void createPet (PetDto petDto) throws Exception;
	public void createClinicHistory (ClinicHistoryDto clinicHistoryDto) throws Exception;
	public void createOrder (OrderDto orderDto) throws Exception;
}
