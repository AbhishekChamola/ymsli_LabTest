package com.Question1.StaticBlockInitialization;

public class StaticBlockInitialization {
private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization(){
    	System.out.println("constructor is called");
    }
    
    static{
        try{
            instance = new StaticBlockInitialization();
        }
        catch(Exception e){
            throw new RuntimeException("Exception ocuured!!");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
    	System.out.println("getInstance is called");
        return instance;
    }

}
