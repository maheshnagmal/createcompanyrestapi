package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.createcompany.demo.model.PaymentIn;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "paymentin",path="paymentin")
public interface PaymentInRepo extends JpaRepository<PaymentIn, Integer> {

}
