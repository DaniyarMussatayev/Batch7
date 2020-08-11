package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class InsuranceTest {

	// Create a class Insurance that will have an attribute as insuranceName and
	// unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	// Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	// has petType attribute. Create 3 objects of the sub classes and store them in
	// ArrayList. Using for loop/advanced for loop/ iterator access all methods of
	// the class.

	public static void main(String[] args) {
		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Tesla", "Geico"));
		insurance.add(new Pet("Dog", "SuperInsurance"));
		insurance.add(new Health("BeSafe"));

		System.out.println("--------------for loop-----------------");
		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
		}

		System.out.println();
		System.out.println("--------------for each loop-----------------");
		for (Insurance insurance2 : insurance) {
			insurance2.getQuote();
			insurance2.cancelInsurance();
		}

		System.out.println();
		System.out.println("--------------using iterator-----------------");
		Iterator<Insurance> it = insurance.iterator();
		while(it.hasNext()) {
			Insurance a=it.next();
			a.getQuote();
			a.cancelInsurance();
		}

	}

}
