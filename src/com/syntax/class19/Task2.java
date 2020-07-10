package com.syntax.class19;

public class Task2 {
	// Create a method that will take a String as a parameter and returns reversed
	// String. Method should be available to all classes within your project and
	// accessible by class name.
	
	public static String reversed(String str) {
		String result="";
		for (int i =str.length()-1; i>=0; i--) {
			result=result+str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(reversed("Hello"));
	}
}
