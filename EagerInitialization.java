package com.Question1.EagerInitialization;


	public class EagerInitialization {
	    
	    private static final EagerInitialization instance = new EagerInitialization();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitialization(){
	    	System.out.println("constructor is called");
	    	
	    }

	    public static EagerInitialization getInstance(){
	    	System.out.println("getInstance is called");
	        return instance;
	    }
	}


