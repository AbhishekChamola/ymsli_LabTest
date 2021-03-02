package com.Question1.EnumSingleton;

public class EnumSingletonMain {
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * SingletonEnum singleton = SingletonEnum.INSTANCE;
	 * 
	 * System.out.println(singleton.getValue()); singleton.setValue(2);
	 * System.out.println(singleton.getValue());
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException {
		SingletonEnum enum1 = SingletonEnum.INSTANCE;
		SingletonEnum enum2 = SingletonEnum.INSTANCE;
       
       
        //here the  hashcode will be same
        System.out.println(enum1.hashCode());
        System.out.println(enum2.hashCode());
    }
}
