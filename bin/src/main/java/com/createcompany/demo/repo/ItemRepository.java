package store_module.store.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import store_module.store.classes.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {

	@Query(value="select item_name from item",nativeQuery=true)
	List<String> findByItemName();

	@Query(value="select quantity from item where item_name=?1",nativeQuery=true)
	Integer findByItemQuantity(String item_name);
	
	@Query(value="select quantity from item",nativeQuery=true)
	List<Integer>findByItemQuantity();
	
	@Query(value="select * from item where item_name=?1",nativeQuery=true)
	Item findByItemName(String item_name);

}
