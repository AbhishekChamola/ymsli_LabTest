package com.Question3.service;

import java.util.List;
import java.util.Optional;

import com.Question3.dao.Customer;
import com.Question3.exceptions.CustomException;

public interface CustomerService {
	public List<Customer> getAllCustomers() throws CustomException;

	public void addCustomer(Customer customer);

	public Optional<Customer> getCustomerById(int id);

}
