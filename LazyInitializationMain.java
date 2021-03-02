package com.Question1.LazyInitialization;

public class LazyInitializationMain {
	public static void main(String[] args) {
		//calling for first time
		LazyInitialization.getInstance();
		//calling for second time ,this will not invoke constructor
		LazyInitialization.getInstance();
		
		
	}

}
