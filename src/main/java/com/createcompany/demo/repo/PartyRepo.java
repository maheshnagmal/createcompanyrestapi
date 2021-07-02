package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.createcompany.demo.model.Party;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "party",path="party")
public interface PartyRepo extends JpaRepository<Party, Integer> {

}
