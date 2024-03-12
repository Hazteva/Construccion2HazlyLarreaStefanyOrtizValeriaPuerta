package app.dto;

import app.models.Order;
import app.models.Person;

public class LoanDto {
	private int id;
	private Person person;
	private Order order;
	
	public LoanDto() {
	}
	
	public LoanDto(int id, Person person, Order order) {
		super();
		this.id = id;
		this.person = person;
		this.order = order;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}

}
