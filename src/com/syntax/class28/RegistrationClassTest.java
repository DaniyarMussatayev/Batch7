package com.syntax.class28;

public class RegistrationClassTest {
	public static void main(String[] args) {
		RegistrationClass r = new RegistrationClass();
		r.setUserName("Syntax");
		System.out.println(r.getUserName());
		r.setEmail("yahoo");
		System.out.println("ABC@" + r.getEmail());
		r.setPassword("Syntax");
		System.out.println("Password " +r.getPassword());
		
	}

}
