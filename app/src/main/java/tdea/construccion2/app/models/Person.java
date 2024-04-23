package tdea.construccion2.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.PersonDto;

@Entity
@Table(name="persona")
public class Person {
	@Id
	@Column(name="cedula")
	private long id;
	@Column(name="nombre")
	private String fullName;
	@Column(name="edad")
	private int age;
	@Column(name="role")
	private String rol;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	
	public Person(PersonDto personDto) {
		this.id=personDto.getId();
		this.fullName=personDto.getFullName();
		this.age=personDto.getAge();
		this.rol=personDto.getRol();
		this.userName=personDto.getUserName();
		this.password=personDto.getPassword();
	}
	//Hola
	public Person() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

