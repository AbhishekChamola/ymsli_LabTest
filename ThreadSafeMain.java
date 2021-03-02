package com.Question1.ThreadSafeSingleton;

public class ThreadSafeMain {
	public static void main(String[] args) {
		
		ThreadSafeSingleton.getInstance();
		
		ThreadSafeSingleton.getInstance();
	
	}

}
