package us.hyalen.itemcatalog.restaurant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository <Restaurant, Integer> {

}
