package store_module.store.Repository;
import store_module.store.classes.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "supplier",path="supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
/*@Query(value="select supplier_name from SUPPLIER",nativeQuery=true)
List<String> findBySupplierName();
*/
}