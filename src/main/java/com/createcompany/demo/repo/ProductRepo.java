package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.createcompany.demo.model.Product;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "product",path="product")
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
