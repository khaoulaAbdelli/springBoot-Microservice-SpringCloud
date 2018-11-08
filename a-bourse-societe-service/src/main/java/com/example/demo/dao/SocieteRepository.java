package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Societe;

@RepositoryRestResource(path="SocieteRepo")
public interface SocieteRepository extends JpaRepository<Societe, Long> {

}
