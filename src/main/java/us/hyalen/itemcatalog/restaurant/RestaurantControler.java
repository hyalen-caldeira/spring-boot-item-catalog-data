package us.hyalen.itemcatalog.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantControler {
	@Autowired
	private RestaurantService service;
	
	@RequestMapping("/restaurants")
	public List<Restaurant> getAllRestaurants() {
		return service.getAllRestaurants();
	}
	
	// public Restaurant getRestaurant(@PathVariable("restaurantId") int id) {
	@RequestMapping("/restaurants/{restaurantId}")
	public Restaurant getRestaurant(@PathVariable int restaurantId) {
		return service.getRestaurant(restaurantId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/restaurants")
	public void addRestaurant(@RequestBody Restaurant restaurant) {
		service.addRestaurant(restaurant);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/restaurants/{restaurantId}")
	public void updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable int restaurantId) {
		service.updateRestaurant(restaurantId, restaurant);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/restaurants/{restaurantId}")
	public void deleteRestaurant(@PathVariable int restaurantId) {
		service.deleteRestaurant(restaurantId);
	}
}
