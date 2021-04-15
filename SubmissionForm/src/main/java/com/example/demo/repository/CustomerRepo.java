package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.utils.Customers;

/*public interface CustomerRepo extends CrudRepository<Customers, Integer> {
	// for model and view 
}*/

public interface CustomerRepo extends JpaRepository<Customers, Integer> {

}
