package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("USA", "DC");
		map.put("Germany", "Berlin");
		map.put("UK", "Londond");
		map.put("France", "Paris");

		System.out.println("-----Print all keys and values from a country map using for each loop");
		Set<String> key = map.keySet();

		for (String sort : key) {
			System.out.println(sort + " " + map.get(sort));

		}
		System.out.println();
		System.out.println("-----Print all keys and values from a country map using Iterator");
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + " " + map.get(k));
		}
		System.out.println();
		System.out.println("Print all values from a country map using for each loop");
		Collection<String> value = map.values();
		
		for (String val : value) {
			System.out.println(val);
		}
		System.out.println();
		System.out.println("Print all values from a country map using Iterator");
		Iterator<String> v=value.iterator();
		while (v.hasNext()) {
			String va=v.next();
			System.out.println(va);
		}

	}

}
