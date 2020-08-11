package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW1 {
	// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
	// with water.
	public static void main(String[] args) {
		List<String> drinks = new ArrayList<>();
		drinks.add("whisky");
		drinks.add("juice");
		drinks.add("cola");
		drinks.add("limonad");
		System.out.println(drinks);

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.contains("e")) {
				drinks.set(i, "water");

			}

		}
		System.out.println(drinks);
	}

}
