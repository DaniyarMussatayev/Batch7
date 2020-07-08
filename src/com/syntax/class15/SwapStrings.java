package com.syntax.class15;

public class SwapStrings {
	public static void main(String[] args) {
		String str1 = "Sunday";
		String str2 = "Monday";
		str1 = str1.concat(" " + str2);
		str2 = str1.substring(0, str1.length() - str2.length() - 1);
		str1 = str1.replace(str2, "").trim();
		System.out.println("STR1 values is " + str1);
		System.out.println("STR2 values is " + str2);
	}

}
