package com.Question1.SerializationIssue;

import java.io.Serializable;

public class SerializationSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationSingleton(){}
    
    private static class getInstanceHelper{
        private static final SerializationSingleton instance = new SerializationSingleton();
    }
    
    public static SerializationSingleton getInstance(){
        return getInstanceHelper.instance;
    }
    
} 


