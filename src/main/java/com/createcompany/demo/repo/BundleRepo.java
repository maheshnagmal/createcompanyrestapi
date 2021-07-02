package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.createcompany.demo.model.Bundle;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "bundle",path="bundle")
public interface BundleRepo extends JpaRepository<Bundle, Integer> {

}
