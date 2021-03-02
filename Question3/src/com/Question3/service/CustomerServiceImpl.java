package com.Question3.service;

import java.util.List;
import java.util.Optional;

import com.Question3.dao.Customer;
import com.Question3.dao.CustomerDao;
import com.Question3.dao.CustomerDaoImpl;
import com.Question3.exceptions.CustomException;

public class CustomerServiceImpl implements CustomerService {

		private CustomerDao customerDao;
		
		
		public CustomerServiceImpl() {
			customerDao=new CustomerDaoImpl();
		}

		
		public CustomerDao getEmployeeDao() {
			return customerDao;
		}


		public void setEmployeeDao(CustomerDao employeeDao) {
			this.customerDao = employeeDao;
		}


		@Override
		public List<Customer> getAllCustomers()throws CustomException {
			List<Customer>employees=customerDao.getAllCustomers();
			return employees;
		}

		@Override
		public void addCustomer(Customer customer) {
			customerDao.addCustomer(customer);
		}


		@Override
		public Optional<Customer> getCustomerById(int id) {
			return customerDao.getCustomerById(id);
		}


	}

