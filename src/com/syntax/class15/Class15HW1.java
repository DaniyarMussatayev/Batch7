package com.syntax.class15;

public class Class15HW1 {
	public static void main(String[] args) {
		//How would you reverse a String character by character?
		
		String original = "Hello world!";
		
		for (int i = original.length()-1; i >=0;i--) {
		System.out.print(original.charAt(i));
			
		}

	}
}
