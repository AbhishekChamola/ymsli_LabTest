package com.bankapp.service;

public class Owner {
	private String name;
	private Date date;
	private String nic;
	
	
	public Owner() {}


	public Owner(String name, String nic,Date date) {
		this.name = name;
		this.date = date;
		this.nic = nic;
	}
	
	public Owner(Owner tempOwner) {
		this.name = tempOwner.getName();
		this.date = tempOwner.getDate();
		this.nic = tempOwner.getNic();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}
	
	public void print() {
		System.out.println("Owner :");
		System.out.println("Name: " + this.name);
		System.out.println("Date: " + this.date);
		System.out.println("Nic: " + this.nic);
	}
	
	
	@Override
	public String toString() {
		return "Owner [name=" + name + ", date=" + date + ", nic=" + nic + "]";
	}
	
	
}
