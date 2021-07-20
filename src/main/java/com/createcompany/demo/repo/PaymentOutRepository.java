package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.createcompany.demo.model.PaymentOut;

@RepositoryRestResource(collectionResourceRel = "paymentout",path="paymentout")
public interface PaymentOutRepository extends JpaRepository<PaymentOut, Integer> {

}
