package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
public class HWMap {
//	Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//	Check how many entries you have?
//	Update company on a 4th floor 
//	Remove company on the 7th floor
//	Print your map
//
//	2. Write code to get key and a value pair using Iterator
//	3. Look into EntrySet
//	4. Take some rest
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "Google");
		floors.put(2, "Facebook");
		floors.put(3, "Syntax");
		floors.put(4, "Amazom");
		floors.put(5, "SpaceX");
		floors.put(6, "Oracle");
		floors.put(6, "Oracle");
		floors.put(7, "Linkedin");
		System.out.println("Building has " + floors.size() + " floors");
		System.out.println(floors);

		System.out.println();
		System.out.println("--upd company on 4th floor");
		floors.put(4, "Uber");
		System.out.println(floors);

		System.out.println();
		System.out.println("--removing company on 7th floor");
		floors.remove(7);
		System.out.println(floors);

		System.out.println();
		Set<Integer> keys = floors.keySet();
		System.out.println("--using iterator get key and a value pair");
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int key=it.next();
			System.out.println(key+" = " +floors.get(key));
		}

	}

}
