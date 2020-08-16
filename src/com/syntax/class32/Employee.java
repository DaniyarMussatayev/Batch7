package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {

		Map<String, Double> employees = new LinkedHashMap<>();
		employees.put("Ahmet", 120000.0);
		employees.put("John", 90000.0);
		employees.put("Will", 99000.0);
		employees.put("Bruce", 190000.0);

		Collection<Double> values = employees.values();

		double max = 0;
		for (double value : values) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println(max);

		Set<Entry<String, Double>> allEntries = employees.entrySet();

		for (Entry<String, Double> entry : allEntries) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey() + "=$" + entry.getValue());
			}
		}

	}
}
