package com.syntax.class14;

public class StringMethods {
	
	public static void main(String[] args) {
		// 1st way to create a String using String literal, the most popular way
		String name = "Olga"; // literal

		// 2nd way to create String using new keyword
		String name1 = new String();
		name1 = "Olga";

		System.out.println(name);
		System.out.println(name1);

		// methods of String class
		String school = "Syntax";
		System.out.println("******.length() method****************");
		// tells how many characters are in the String
		school.length();
		int size = school.length();
		System.out.println("The length of the String is = " + size);

		String greetings = "Hello Syntax";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);

		System.out.println("******.toUpperCase() method****************");
		String city = "Washington DC";
		city.toUpperCase();
		String newCity = city.toUpperCase();
		System.out.println(newCity);

		System.out.println("******.toLowerCase() method****************");
		String newCity1 = newCity.toLowerCase();
		System.out.println(newCity1);

		System.out.println("******.concat() method****************");
		String country = "USA ";
		String capital = "Washington DC";

		// + with String serves as concatenation operator
		// + with numbers servers as arithmetic operator
		
		System.out.println(country + capital);
		// .concat() method can work only with Strings, both values should be String type
		System.out.println(country.concat(capital));
		
		int day = 27;
		String dayString = "27";
		String month = " June ";
		System.out.println(day + month);
		// System.out.println(day.concat(month)); will not work this way
		
		System.out.println(Integer.parseInt(dayString));
		
		System.out.println("******.isEmpty() method****************");
		
		String str = "Hello";
		String str1 = "";
		String str2 = " ";
		str.isEmpty();
		
		// if length of the String is = 0 --> then it is Empty
		boolean isEmpty = str.isEmpty();
		boolean isEmpty1 = str1.isEmpty();
		System.out.println(isEmpty);
		System.out.println(isEmpty1);
		System.out.println(str2.isEmpty());
		
		System.out.println("******.trim() method****************");
		
		String cat = "My cat name is Jessy";
		String dog = "          My dog name is   Charly       ";
		System.out.println("-----------------Before trimming ------------");
		System.out.println(cat);
		System.out.println(dog);
		System.out.println("-----After the trimming------");
		// cut spaces befor String and all spaces after, NOT inside
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
	
		
		
		
		
		
		
	}

}
