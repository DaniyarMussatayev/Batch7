package com.syntax.class28;
//Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 

//Requirements: 
//
//Valid email consider to be only yahoo
//Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.

public class RegistrationClass {
	private String email, userName, password;
	
	public void setEmail(String email) {
		if (email.equalsIgnoreCase("yahoo")) {
			this.email = email;
		}
	}
	public void setUserName(String userName) {
		if (userName.length() >= 6 && userName.isEmpty()) {
			this.userName = userName;
		}
	}
	public void setPassword(String password) {
		if (password.length() >= 6 &&password.isEmpty()&& (!(password.equalsIgnoreCase(userName))) ) {
			this.password=password;
		}
		else {
			
		}
	}
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}
