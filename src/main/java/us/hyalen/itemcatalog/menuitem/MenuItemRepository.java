package us.hyalen.itemcatalog.menuitem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository <MenuItem, Integer> {
	// instance variable <restaurant> and within it the instance variable <id>
	// That way the spring can implement the find method. 
	// id is a property of the restaurant property
	public List<MenuItem> findByRestaurantId(int id);
}
