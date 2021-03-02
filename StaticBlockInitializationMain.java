package com.Question1.StaticBlockInitialization;

import com.Question1.EagerInitialization.EagerInitialization;

public class StaticBlockInitializationMain {
	public static void main(String[] args) {
		
		//calling for the first time 
		StaticBlockInitialization.getInstance();
		
		StaticBlockInitialization.getInstance();


		
	}

}
