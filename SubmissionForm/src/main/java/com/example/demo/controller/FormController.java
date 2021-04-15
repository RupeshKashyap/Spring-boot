package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.CustomerRepo;
import com.example.demo.utils.Customers;
import com.sun.el.stream.Optional;

@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;

	@RequestMapping("/")
	public String details() {

		return "edureka";
	}

	@RequestMapping("/details")
	public String details(Customers customers) {

		repo.save(customers);
		return "edureka";
	}

	@RequestMapping("/getdetails")
	public String getDetails() {

		return "ViewCustomers";
	}

	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam("cid") int cid ) {
		ModelAndView mv = new ModelAndView("Retrive");
		Customers customers =  repo.findById(cid).orElse(null);
		mv.addObject(customers);	
		return mv;
	}

	@RequestMapping("/customers")
	@ResponseBody 
	public List<Customers> getCustomes() {
		
		return repo.findAll();
	}
	@RequestMapping("/customers/{cid}")
	@ResponseBody 
	public java.util.Optional<Customers> getCustomerById(@PathVariable ("cid") int cid) {
		return repo.findById(cid);
	}
	
	@DeleteMapping("/customers/{cid}")
 
	public Customers deleteCustomerById(@PathVariable ("cid") int cid) {
		
		Customers cust = repo.getOne(cid);
		 repo.delete(cust);
		 return cust ;
	}
	
	@PutMapping(path = "/update", consumes = {"application/json"})
	 
	public Customers deleteCustomerById(@RequestBody Customers customers) {
		
		 repo.save(customers);
		 return customers ;
	}
}
