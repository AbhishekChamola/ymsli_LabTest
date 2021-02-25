package com.bankapp.controller;


import com.bankapp.service.CurrentAccount;
import com.bankapp.service.Date;
import com.bankapp.service.Owner;


public class AccountTester {
	public static void main(String[] s) {
		
		Date date = new Date(01,12,2020);
		Owner owner = new Owner("YMSLI", "12345", date);
		
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(100000);
		account2.setOwner(owner);
		account2.setNumber("678VFGH45");
		account2.setMinimumBalance(5000);
		
	}
}
