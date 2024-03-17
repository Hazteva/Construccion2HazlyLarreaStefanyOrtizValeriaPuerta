package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.config.MYSQLConnection;
import app.dto.PetDto;
import app.models.Pet;

import app.config.MYSQLConnection;
import app.dto.PetDto;
import app.models.Pet;

public class PetDaoImp implements PetDao{
public Connection connection = MYSQLConnection.getConnection();
	
	public void createPet(PetDto petDto) throws Exception {
		String query = "INSERT INTO MASCOTA(ID,PROPIETARIO,ESPECIE,EDAD,PESO,RAZA,ESPECIE,CARACTERISTICAS)  VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setLong(i++, petDto.getIdPet());
		preparedStatement.setString(i++, petDto.getNamePet());
		preparedStatement.setString(i++, petDto.getSpecies());
		preparedStatement.setInt(i++, petDto.getAgePet());
		preparedStatement.setString(i++, petDto.getRace());
		preparedStatement.setString(i++, petDto.getCaracteris());
        preparedStatement.setDouble(i++, petDto.getWeight());
		preparedStatement.execute();
		preparedStatement.close();
	}

	public boolean findPetExist(PetDto petDto) throws Exception {
		String query = "SELECT 1 FROM MASCOTA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, petDto.getIdPet());
		ResultSet resulSet = preparedStatement.executeQuery();
		boolean petExists = resulSet.next();
		resulSet.close();
		preparedStatement.close();
		return petExists;
	}

	public PetDto findPetById(PetDto petDto) throws Exception {
		String query = "SELECT ID,PROPIETARIO,ESPECIE,EDAD,PESO,RAZA,ESPECIE,CARACTERISTICAS FROM MASCOTA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, petDto.getIdPet());
		ResultSet resulSet = preparedStatement.executeQuery();
		if(resulSet.next()) {
			Pet pet = new Pet();
			pet.setIdPet(resulSet.getLong("ID"));
			pet.setNamePet(resulSet.getString("NAME"));
			pet.setSpecies(resulSet.getString("SPECIES"));
			pet.setAgePet(resulSet.getInt("AGE"));
			pet.setRace(resulSet.getString("RACE"));
			pet.setCaracteris(resulSet.getString("CARACTERIS"));
            pet.setWeight(resulSet.getDouble("WEIGHT"));
			resulSet.close();
			preparedStatement.close();
			return new PetDto();
		}
		resulSet.close();
		preparedStatement.close();
		return null;
	}
}
