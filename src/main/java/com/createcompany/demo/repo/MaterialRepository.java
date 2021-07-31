package store_module.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import store_module.store.classes.Materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "material",path="material")
public interface MaterialRepository extends JpaRepository<Materials,Integer> {//  extends JpaRepository<Materials,Integer> {

}
