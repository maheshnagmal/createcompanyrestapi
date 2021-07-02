package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.createcompany.demo.model.Address;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "address",path="address")
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
