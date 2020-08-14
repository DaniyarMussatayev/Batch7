package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cities {

//	Create a Map from array of cities that will sort keys in alphabetical order. 
//	As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city . 

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("Paris", 5);
		map.put("Moscow", 6);
		map.put("Washington DC", 13);
		map.put("Los Angeles", 11);

		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);

		Iterator<Entry<String, Integer>> it = entry.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entr=it.next();
			if(entr.getValue()>7) {
				it.remove();
			}else {
				System.out.println(entr.getKey()+ " "+entr.getValue());
			}

		}

	}

}
