package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HW2 {
	public static void main(String[] args) {

//		Create a collection of integers in which you can keep duplicates. 
//		Write a logic to find sum of all integers

		Collection<Integer> collection = new LinkedHashSet<>();
		collection.add(21);
		collection.add(1);
		collection.add(2);
		collection.add(21);
		collection.add(221);
		collection.add(221);
		
		Integer sum=0;
		for (Integer total : collection) {
			sum=sum+total;
		}
		System.out.println(sum);

		
	}

}
