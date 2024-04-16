package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.config.MYSQLConnection;
import app.dto.ClinicHistoryDto;
import app.dto.OrderDto;
import app.dto.PersonDto;
import app.models.Pet;
import app.dao.ClinicHistoryDaoImp;

public class ClinicHistoryDaoImp{
	public Connection connection = MYSQLConnection.getConnection();
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		String query = "INSERT INTO PERSONA(FECHA,MASCOTA,MEDICO,MOTIVO,SINTOMATOLOGIA,PROCEDIMIENTO,MEDICAMENTO,ORDER,VACUNACION,ALERGIA,DETALLES ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setLong(i++, clinicHistoryDto.getDate());
		preparedStatement.setLong(i++, clinicHistoryDto.getVeterinarian().getId());
		preparedStatement.setString(i++, clinicHistoryDto.getReasonForConsultation());
		preparedStatement.setString(i++, clinicHistoryDto.getSymptomatology());
		preparedStatement.setString(i++, clinicHistoryDto.getProcedureDetails());
		preparedStatement.setString(i++, clinicHistoryDto.getMedicines());
		preparedStatement.setLong(i++, clinicHistoryDto.getIdOrder().getIdOrder());
		preparedStatement.setString(i++, clinicHistoryDto.getVaccinationHistory());
		preparedStatement.setString(i++, clinicHistoryDto.getAllergies());
		preparedStatement.setString(i++, clinicHistoryDto.getProcedureDetails());
		preparedStatement.execute();
		preparedStatement.close();
	}
	
	public ClinicHistoryDto findClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		String query = "SELECT FECHA,MASCOTA,MEDICO,MOTIVO,SINTOMATOLOGIA,PROCEDIMIENTO,MEDICAMENTO,ORDER,VACUNACION,ALERGIA,DETALLES FROM FACTURA WHERE MASCOTA = ? AND MEDICO = ? AND MOTIVO = ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, clinicHistoryDto.getPet().getNamePet());
		preparedStatement.setString(2, clinicHistoryDto.getVeterinarian().getFullName());
		preparedStatement.setString(3, clinicHistoryDto.getReasonForConsultation());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			
			clinicHistoryDto.setDate(resultSet.getLong("FECHA"));
			Pet pet = new Pet();
			pet.setIdPet(resultSet.getLong("MASCOTA"));			
            clinicHistoryDto.setVeterinarian(new PersonDto());
            clinicHistoryDto.setReasonForConsultation(resultSet.getString("MOTIVO"));
            clinicHistoryDto.setSymptomatology("SINTOMATOLOGIA");
            clinicHistoryDto.setSymptomatology("PROCEDIMIENTO");
            clinicHistoryDto.setSymptomatology("MEDICAMENTO");
            clinicHistoryDto.setIdOrder(new OrderDto());
            clinicHistoryDto.setVaccinationHistory(resultSet.getString("VACUNACION"));
            clinicHistoryDto.setAllergies(resultSet.getString("ALERGIA"));
            clinicHistoryDto.setProcedureDetails(resultSet.getString("DETALLES"));
			
			resultSet.close();
			preparedStatement.close();
			return new ClinicHistoryDto();
		}
		resultSet.close();
		preparedStatement.close();
		return null;
	}
}
