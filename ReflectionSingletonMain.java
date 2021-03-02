package com.Question1.ReflectionIssue;

import java.lang.reflect.Constructor;

public class ReflectionSingletonMain {
	public static void main(String[] args) {
		ReflectionSingleton firstObject = ReflectionSingleton.getInstance();
		ReflectionSingleton secondObject = null;
	        try {
	            Constructor constructor = ReflectionSingleton.class.getDeclaredConstructor();
	            constructor.setAccessible(true);
	            secondObject = (ReflectionSingleton) constructor.newInstance();
	        }
	        catch (Exception ex) {
	            System.out.println(ex);
	        }

	        System.out.println("Hashcode of firstObject - "+firstObject.hashCode());
	        System.out.println("Hashcode of secondObject - "+secondObject.hashCode());
		// hashcodes are not same which violates singleton
	}

}
