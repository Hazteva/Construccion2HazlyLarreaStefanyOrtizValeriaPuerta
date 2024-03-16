package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.config.MYSQLConnection;
import app.dto.BillDto;
import app.dto.ClinicHistoryDto;
import app.dto.PersonDto;
import app.dto.PetDto;

public class ClinicHistoryDaoImp {
	public Connection connection = MYSQLConnection.getConnection();
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		String query = "INSERT INTO PERSONA(FECHA,MASCOTA,MEDICO,MOTIVO,SINTOMATOLOGIA,PROCEDIMIENTO,MEDICAMENTO,ORDER,VACUNACION,ALERGIA,DETALLES ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setDate(i++, clinicHistoryDto.getDate());
		preparedStatement.setLong(i++, clinicHistoryDto.getVeterinarian().getId());
		preparedStatement.setString(i++, clinicHistoryDto.getReasonForConsultation());
		preparedStatement.setString(i++, clinicHistoryDto.getSymptomatology());
		preparedStatement.setString(i++, clinicHistoryDto.getProcedureDetails());
		preparedStatement.setString(i++, clinicHistoryDto.getMedicines());
		//preparedStatement.OrderDto(i++, clinicHistoryDto.getIdOrder());
		preparedStatement.setString(i++, clinicHistoryDto.getVaccinationHistory());
		preparedStatement.setString(i++, clinicHistoryDto.getAllergies());
		preparedStatement.setString(i++, clinicHistoryDto.getProcedureDetails());
		preparedStatement.execute();
		preparedStatement.close();
	}
	
	public BillDto findBillById(ClinicHistoryDto clinicHistoryDto) throws Exception {
		String query = "SELECT FECHA,MASCOTA,MEDICO,MOTIVO,SINTOMATOLOGIA,PROCEDIMIENTO,MEDICAMENTO,ORDER,VACUNACION,ALERGIA,DETALLES FROM FACTURA WHERE ID = ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setLong(1, ClinicHistoryDto.getIdClinicHostory());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			BillDto bill = new BillDto();
			bill.setIdBill(resultSet.getLong("ID_BILL"));
			
			PetDto petDto = new PetDto();
			petDto.setIdPet(resultSet.getLong("ID_PET"));
			bill.setIdPet(petDto);
			
			PersonDto personDto = new PersonDto();
			personDto.setId(resultSet.getLong("OWNER_ID"));
			bill.setOwnerId(personDto);
			
			bill.setProductName(resultSet.getString("PRODUCT_NAME"));
			bill.setPrice(resultSet.getDouble("PRICE"));
			bill.setQuantity(resultSet.getInt("QUANTITY"));
			bill.setDate(resultSet.getDate("DATE"));
			
			resultSet.close();
			preparedStatement.close();
			return new BillDto();
		}
		resultSet.close();
		preparedStatement.close();
		
		return null;
	}
}
