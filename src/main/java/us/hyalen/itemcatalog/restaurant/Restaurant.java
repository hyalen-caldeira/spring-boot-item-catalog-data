package us.hyalen.itemcatalog.restaurant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	private int id;
	private String name;
	
	public Restaurant() {
		
	}
	
	public Restaurant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
