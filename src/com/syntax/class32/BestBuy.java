package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {

//	Create a map of Best Buy store. Place
//	item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//	Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(7664847, "Printer");
		map.put(7879885, "TV");
		map.put(7662847, "Phone");
		map.put(7624847, "Table");

		Set<Entry<Integer, String>> entry = map.entrySet();
		for (Entry<Integer, String> entr : entry) {
			Integer key = entr.getKey();
			String value = entr.getValue();

			System.out.println(key + " = " + value);

		}
	}

}
