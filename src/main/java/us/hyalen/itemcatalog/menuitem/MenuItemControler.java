package us.hyalen.itemcatalog.menuitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import us.hyalen.itemcatalog.restaurant.Restaurant;

@RestController
public class MenuItemControler {
	@Autowired
	private MenuItemService service;
	
	@RequestMapping("/restaurants/{restaurantId}/menuitems")
	public List<MenuItem> getAllMenuItems(@PathVariable int restaurantId) {
		return service.getAllMenuItems(restaurantId);
	}
	
	@RequestMapping("/restaurants/{restaurantId}/menuitems/{menuItemId}")
	public MenuItem getMenuItem(@PathVariable int menuItemId) {
		return service.getMenuItem(menuItemId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/restaurants/{restaurantId}/menuitems")
	public void addMenuItem(@RequestBody MenuItem menuItem, @PathVariable int restaurantId) {
		// TODO, search for restaurant before add a menu item
		menuItem.setRestaurant(new Restaurant(restaurantId, "Temp"));
		
		service.addMenuItem(menuItem);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/restaurants/{restaurantId}/menuitems/{menuItemId}")
	public void updateMenuItem(
		@RequestBody MenuItem menuItem, 
		@PathVariable int restaurantId,
		@PathVariable int menuItemId) {
		// TODO, search for restaurant before add a menu item
		menuItem.setRestaurant(new Restaurant(restaurantId, "Temp"));
		
		service.updateMenuItem(menuItem);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/restaurants/{restaurantId}/menuitems/{menuItemId}")
	public void deleteMenuItem(@PathVariable int menuItemId) {
		service.deleteMenuItem(menuItemId);
	}
}
