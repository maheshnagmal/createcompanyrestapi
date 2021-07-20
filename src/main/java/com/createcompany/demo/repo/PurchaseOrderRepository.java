package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.createcompany.demo.model.PurchaseOrder;



@RepositoryRestResource(collectionResourceRel = "purchaseorder",path="purchaseorder")
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {

}
