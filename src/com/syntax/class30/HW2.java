package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {
	// Create an arrayList of even numbers from 1 to 50. Remove any number that is
	// divisible by 5 from that arrayList.

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		for (int i = 2; i <= 50; i=i+2) {
			num.add(i);
		}

		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			Integer evenNum = it.next();
			if(!(evenNum%5==0)) {
				it.remove();
			}
		}
		System.out.println(num);
	}
}
