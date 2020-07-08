package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		String name = "Bruce";
		String lastName = "Lee";
		char grade = '5';
		String city = "New York";
		String state = "NY";
		long phoneNumber = 973_421_4564L;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);	
		
		city = "Newark";
		state = "New Jersey";
		phoneNumber = 201_564_3644L;
		grade = '6';
		
		System.out.println("------------------------");		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);		
		System.out.println(grade);
		
		System.out.println("1. My name is " + name + " and my last name is " + lastName + " .");
		System.out.println("2. I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber + " !");
	}

}
