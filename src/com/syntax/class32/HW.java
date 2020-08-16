package com.syntax.class32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class HW {
	public static void main(String[] args) {
//		Create the collection that will store single uniques Objects of a String type in which order is preserved.
//		Write a logic to concatenate all string from the collection.

		Collection<String> s = new LinkedHashSet<>();
		s.add("Visa");
		s.add("Master Card");
		s.add("American Express");
		
		System.out.println(s);
		
		String collection="";
		for (String all : s) {
			collection+=all+" ";
		}
		System.out.print(collection);

	}

}
