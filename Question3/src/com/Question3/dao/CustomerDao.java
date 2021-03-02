package com.Question3.dao;

import java.util.*;

import com.Question3.exceptions.CustomException;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id);
	List<Customer> getAllCustomers() throws CustomException;
	
}