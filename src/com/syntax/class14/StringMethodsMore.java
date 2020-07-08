package com.syntax.class14;

public class StringMethodsMore {
	public static void main(String[] args) {
		
		System.out.println("**********.charAt() method******");
		
		String season = "summers";
		season.charAt(1);
		char character = season.charAt(1);
		System.out.println(season.charAt(0));
		
		System.out.println("**********.indexOf() method******");
		
		
		season.indexOf('S');
		int index = season.indexOf('S');
		System.out.println(index);
		
		String hello = "Hello Ksenia";
		int indexOfKsenia = hello.indexOf("Ksenia");
		System.out.println("Index of Ksenia in the String " + hello + " is = " + indexOfKsenia);
		
		int index1 = season.indexOf('s', 3);
		System.out.println(index);
		
		System.out.println("**********.substring() method******");
		String message = "You guys are awesome";
		message.substring(4);
		String substring = message.substring(4); // take string starting from index 4
		System.out.println(substring);
		
		message.substring(4, 7);
		String substring1 = message.substring(4, 7); // take string starting from index 4 till 7
		System.out.println(substring1);
		
		
		
	}

}
