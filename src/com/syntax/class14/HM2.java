package com.syntax.class14;

public class HM2 {
	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
		
		String name ="Yadnus is reverse of Sunday";
		int size = name.length();
		if(!name.isEmpty()) {
			if(name.length()%2==1 || name.length()>=3 ) {
				int print = (size-1)/2;
				System.out.println(name.charAt(print));
			}
		}

	}
}
