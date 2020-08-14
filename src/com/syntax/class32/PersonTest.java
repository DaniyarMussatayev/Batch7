package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
	public static void main(String[] args) {
		Map<Integer, Person> map = new TreeMap<>();
		map.put(001, new Person("Donald", "Duck", 30, 60000.00));
		map.put(002, new Person("Graham", "Bring", 27, 90000.00));
		map.put(003, new Person("Beverly", "Hill", 30, 50000.00));
		map.put(004, new Person("Ray", "Daymond", 30, 80000.00));
		map.put(005, new Person("Charles", "Slo", 30, 40000.00));

		Set<Entry<Integer, Person>> per = map.entrySet();

		for (Entry<Integer, Person> entry : per) {
			Person value=entry.getValue();
			Integer id=entry.getKey();
			value.userInformation();
		
			
		}

	}

}