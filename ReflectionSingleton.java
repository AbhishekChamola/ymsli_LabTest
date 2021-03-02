package com.Question1.ReflectionIssue;

public class ReflectionSingleton {
private static final ReflectionSingleton instance = new ReflectionSingleton();
    
    //private constructor to avoid client applications to use constructor
    private ReflectionSingleton(){}

    public static ReflectionSingleton getInstance(){
        return instance;
    }
	

}
