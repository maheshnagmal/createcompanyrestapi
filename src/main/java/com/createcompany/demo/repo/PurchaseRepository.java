package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.createcompany.demo.model.Purchase;

@RepositoryRestResource(collectionResourceRel = "purchase",path="purchase")
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
