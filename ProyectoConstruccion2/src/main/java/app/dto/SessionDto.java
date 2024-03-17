package app.dto;

public class SessionDto {
	private long id;
	private String userName;
	private String userRoll;

	public SessionDto(long id, String userName, String userRoll) {
		this.id = id;
		this.userName = userName;
		this.userRoll = userRoll;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRoll() {
		return userRoll;
	}

	public void setUserRoll(String userRoll) {
		this.userRoll = userRoll;
	}
}
