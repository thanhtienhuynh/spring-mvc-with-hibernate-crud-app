package com.luv2code.springdemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);
}