package com.Question3.controller;

import java.util.List;
import java.util.Optional;

import com.Question3.dao.Customer;
import com.Question3.exceptions.CustomException;
import com.Question3.service.CustomerService;
import com.Question3.service.CustomerServiceImpl;

public class CustomerController {
	public static void main(String[] args) {
		CustomerService custService = new CustomerServiceImpl();

		Optional<Customer> cust = custService.getCustomerById(2);

		String name = cust.map(customer -> customer.getName()).orElse("Customer not found");
		System.out.println(name);

		List<Customer> customers;
		try {
			customers = custService.getAllCustomers();
			for (Customer customer : customers) {
				System.out.println(customer);
			}
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}
}
