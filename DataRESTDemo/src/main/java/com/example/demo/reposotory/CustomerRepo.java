package com.example.demo.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.utils.Customers;

// provide the all data based on default method like crud 
@RepositoryRestResource(collectionResourceRel = "customers" , path = "customers")
public interface CustomerRepo extends JpaRepository<Customers, Integer> {

}
