package us.hyalen.itemcatalog.menuitem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {
	@Autowired
	private MenuItemRepository menuItemRepository;
	
	public List<MenuItem> getAllMenuItems(int restaurantId) {
		List<MenuItem> menuItemList = new ArrayList<>();
		
		menuItemRepository.findByRestaurantId(restaurantId).forEach(menuItemList::add);
		
		return menuItemList;
	}
	
	public MenuItem getMenuItem(int id) {
		return menuItemRepository.findOne(id);
	}

	public void addMenuItem(MenuItem menuItem) {
		menuItemRepository.save(menuItem);
	}

	public void updateMenuItem(MenuItem menuItem) {
		menuItemRepository.save(menuItem);
	}

	public void deleteMenuItem(int menuItemId) {
		menuItemRepository.delete(menuItemId);
	}
}
