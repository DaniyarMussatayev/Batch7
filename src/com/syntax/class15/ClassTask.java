package com.syntax.class15;

public class ClassTask {
	public static void main(String[] args) {
		String str = "New sentence with spaces";
		str = str.replace(" ", "");
		System.out.println(str);
		
		String str1 = "vsdvk12(#$(*#%(sdvds2313";
		int num = str1.replaceAll("[^A-Za-z]", "").length();
		System.out.println(num);
		
		String str2 = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = str2.split("[?]");
		System.out.println(array.length);
	}

}
