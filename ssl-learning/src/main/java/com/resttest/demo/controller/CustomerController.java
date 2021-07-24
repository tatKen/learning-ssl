package com.resttest.demo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resttest.demo.pojo.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController{
	
	@GetMapping("/{id}")
	@Secured("ROLE_USER")
	public Customer getCustomer(@PathVariable Long id) {
		return new Customer(id, "Customer" + id);  
	}
}

