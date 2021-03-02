package com.Question1.LazyInitialization;

public class LazyInitialization {
private static LazyInitialization instance;
    
    private LazyInitialization(){
    	System.out.println("constructor is called");
    }
    
    public static LazyInitialization getInstance(){
    	System.out.println("getInstance is called");
        if(instance == null){
        	
            instance = new LazyInitialization();
        }
        return instance;

}
}
