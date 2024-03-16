package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import app.config.MYSQLConnection;
import app.dto.ClinicHistoryDto;

public class ClinicHistoryDaoImp {
	public Connection connection = MYSQLConnection.getConnection();
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		String query = "INSERT INTO PERSONA(DATE,VETERINARIAN,REASONFORCONSULTATION,SYMTOMATOLOGY,PROCEDURA,MEDICINES, IDORDER, VACCINATIONHISTORY, ALLERGIES, PROCEDURADETAILS) VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setString(i++, clinicHistoryDto.getDate());
		preparedStatement.setString(i++, clinicHistoryDto.getVeterinarian());
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
}
