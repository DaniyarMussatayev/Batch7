package com.syntax.class15;

public class Task {
	public static void main(String[] args) {
//		Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		String sentence = "I love a life";
		sentence = sentence.replace(" " , "");// use replace
		
			System.out.print(sentence);
		System.out.println("--------");
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many alpha characters are there in the String.

		//one of the IQ
		// You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
				// today?” How would you find out how many sentences are in that String?
				
				String str="ggiugiug 86868 69*()@@!!";
				
				str=str.replaceAll("[^A-Za-z]", "");

				System.out.println(str.length());
				
				String a ="1.Is it saturday 2.Is it raining 3.Do we have a Java Class today?";
				String[] array = a.split("[0-9]");
				
				int sentences = array.length;
				
				System.out.println("Total number of sentences is " + sentences);
		System.out.println("-----------");

		// You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
		// today?” How would you find out how many sentences are in that String?
		
		
		
		
	}

}
