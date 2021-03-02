package com.Question1.ThreadSafeSingleton;

public class ThreadSafeSingleton{
	
private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){
    	System.out.println("constructor is called");
    }
  
    public static ThreadSafeSingleton getInstance(){
    	System.out.println("getInstance is called");
        if(instance == null){
            synchronized (Object.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
