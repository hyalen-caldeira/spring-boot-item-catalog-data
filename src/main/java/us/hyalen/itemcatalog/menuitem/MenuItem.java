package us.hyalen.itemcatalog.menuitem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import us.hyalen.itemcatalog.restaurant.Restaurant;

@Entity
public class MenuItem {
	@Id
	private int id;
	private String name;
	private String description;
	private double price;
	private String course;
	@ManyToOne
	private Restaurant restaurant;
	
	public MenuItem() {
	}
	
	public MenuItem(int id, String name, Restaurant restaurant) {
		super();
		
		this.id = id;
		this.name = name;
		this.restaurant = restaurant;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
}
