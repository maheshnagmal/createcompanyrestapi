package com.createcompany.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.createcompany.demo.model.DrNote;

@RepositoryRestResource(collectionResourceRel = "drnote",path="drnote")
public interface DrNoteRepository extends JpaRepository<DrNote, Integer> {

}
