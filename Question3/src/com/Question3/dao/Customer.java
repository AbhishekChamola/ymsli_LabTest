package com.Question3.dao;

import java.util.Date;

public class Customer {
	private int id;

	private String name;
	private String address;
	private String phone;
	private Date dob;

	public Customer(int id,String name, String address, String phone, Date dob) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}

	public Customer(String name, String address, String phone, Date dob) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer (id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(")");
		return builder.toString();
	}
	


}
