package com.syntax.class15;

public class Class15HW4 {
	public static void main(String[] args) {
		//How would you check if String is palindrome or not?
		
		String name = "Kayak";
		String newName ="";
		for (int i=name.length()-1; i>=0;i-- ) {
			newName=newName+name.charAt(i);
		}System.out.print(newName);
		System.out.println();
		if (name.equalsIgnoreCase(newName)) {
			System.out.print(newName + " is Palindrome");
		}else {
			System.out.print(newName + " is NOT Palindrome");
		}

	}
}
