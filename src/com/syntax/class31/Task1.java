package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Create a Set collection in which you need to add names of the countries. 
//In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
public class Task1 {
	public static void main(String[] args) {
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Switzerland");
		countries.add("UK");
		
		System.out.println("--Using for each loop for retrieving");
		for (String str : countries) {
			System.out.println(str);
		}
		System.out.println("--Using Iterator for retrieving");
		
		Iterator<String> it=countries.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
