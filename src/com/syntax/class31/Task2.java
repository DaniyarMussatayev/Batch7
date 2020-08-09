package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	// Create a Set of cities in which you want to make sure that insertion order is
	// maintained.
	// Using Iterator remove any city that starts with “A”;
	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Los Angeles");
		cities.add("Amsterdam");
		cities.add("Zurich");

		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			String a = it.next();
			if (a.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);

	}
//		TreeSet<String> cities = new TreeSet<>();
//
//		cities.add("Austin");
//		cities.add("Columbus");
//		cities.add("Detroit");
//
//		Iterator<String> cIterator = cities.iterator();
//
//		while (cIterator.hasNext()) {
//			String cit = cIterator.next();
//			if (cit.startsWith("A")) {
//				cIterator.remove();
//			}
//		}
//		System.out.println(cities);

}
