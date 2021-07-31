
package store_module.store.Repository;
import store_module.store.classes.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "product",path="product")
public interface ProductRepository extends JpaRepository<Product,Integer> {

}