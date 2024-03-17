package app.models;

import java.time.LocalDate;
//import java.sql.Date;

public class Movenment {
	private int id;
	private long personId;
	private int orderId;
	private LocalDate movenmentDate;
	private String type;
	
	/*public Movenment () {
		this.movenmentDate = new Date(System.currentTimeMillis());
	}*/
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public LocalDate getMovenmentDate() {
		return movenmentDate;
	}
	
	public void setMovenmentDate(LocalDate movenmentDate) {
		this.movenmentDate = movenmentDate;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

}
