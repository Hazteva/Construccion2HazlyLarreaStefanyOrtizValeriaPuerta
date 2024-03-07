package app.dto;

public class PersonDto {
	private long id;
	private String fullName;
	private int age;
	private String rol;
	
	public PersonDto(long id, String fullName, int age, String rol) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.rol = rol;
	}
	public PersonDto() {};

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
	
	
}

