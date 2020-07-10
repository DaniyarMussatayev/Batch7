package com.syntax.class19;

public class HW {

	private String Vowels(String word) {
		String newStr = " ";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				newStr = newStr + word.charAt(i);
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		HW obj = new HW();
		String str = "World";
		String print =obj.Vowels(str);
		System.out.println(print);
	}
}

//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
//Method should be available inside the class where it was declared and executed by calling it is name.
