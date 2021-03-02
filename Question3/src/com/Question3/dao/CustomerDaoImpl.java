package com.Question3.dao;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.Question3.exceptions.CustomException;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> getAllCustomers()throws CustomException {
		List<Customer> customers = new ArrayList<>();
		Customer customer = null;
	
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cust");

			while (rs.next()) {
				customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
						rs.getString("phone"), rs.getDate("dob"));
				customers.add(customer);
			}
		}catch(SQLException ex) {
			throw new CustomException(ex.getMessage());
		}
		

		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {

		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("insert into cust(name, address, phone, dob) values (?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone());
			pstmt.setDate(4, (Date) customer.getDob());
			int no = pstmt.executeUpdate();
			System.out.println("Customer added with id:"+no);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		PreparedStatement pstmt;
		Customer customer=null;
		try {
			pstmt = connection.prepareStatement("select * from cust where id=?");
			pstmt.setInt(1, id);

			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				customer=new Customer
						(rs.getInt("id"), 
						rs.getString("name"),
						rs.getString("address"),
						rs.getString("phone"), 
						rs.getDate("dob")); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.ofNullable(customer);
	}

}