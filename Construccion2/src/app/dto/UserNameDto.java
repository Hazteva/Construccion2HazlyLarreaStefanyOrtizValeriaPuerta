package app.dto;

public class UserNameDto {
	private String userName;
	private String password;
	private PersonDto person;
	
	public UserNameDto(String userName, String password, PersonDto person) {
		super();
		this.userName = userName;
		this.password = password;
		this.person = person;
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

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}	
}
