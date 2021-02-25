package com.bankapp.service;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date tempdate) {
		this.day = tempdate.getDay();
		this.month = tempdate.getMonth();
		this.year = tempdate.getYear();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("The date is: " + this.day + "-" + this.month + "-" + this.year);
	}
	
	
	@Override
	public String toString() {
		return "Date [Day=" + day + ", Month=" + month + ", Year=" + year + "]";
	}
	
}