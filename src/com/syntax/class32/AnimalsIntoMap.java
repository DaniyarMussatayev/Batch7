package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and White"));

		System.out.println(" 1.       ----          Using EntrySet         ---              ");
		Set<Entry<Integer, Animal>> entries = life.entrySet();

		System.out
				.println("     ----        Access all variables and call all available methods of Animals      ---   ");
		for (Entry<Integer, Animal> e : entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		// write with Iterator
		System.out.println("     ----       Iterator using EntrySet      ---   ");

		Iterator<Entry<Integer, Animal>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<Integer, Animal> a = it.next();
			System.out.println(a.getValue().type);
			System.out.println(a.getValue().color);
			a.getValue().eat();
			a.getValue().sleep();
			System.out.println("  ----------   ");

		}

		System.out.println("2.        ----          Using values()        ---              ");

		Collection<Animal> values = life.values();
		for (Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}
		// write with Iterator
		System.out.println("     ----       Iterator using values()      ---   ");

		Iterator<Animal> iter = values.iterator();
		while (iter.hasNext()) {
			Animal animal1 = iter.next();
			System.out.println(animal1.type);
			System.out.println(animal1.color);
			animal1.eat();
			animal1.sleep();
			System.out.println("  ----------   ");

			System.out.println("3.        ----          Using keySet()        ---              ");

			Set<Integer> keys = life.keySet();

			for (int key : keys) {
				Animal animal = life.get(key);
				System.out.println(animal.type);
				System.out.println(animal.color);
				animal.eat();
				animal.sleep();
				System.out.println("  ----------   ");
			}

			// write with Iterator
			System.out.println("     ----       Iterator using keySet()      ---   ");

//			Iterator<Integer> itera = keys.iterator();
//			while (itera.hasNext()) {
//				Integer animal3 = itera.next();
//				System.out.println(animal3);
//				System.out.println(animal3);
//				animal3.eat();
//				animal3.sleep();
//				System.out.println("  ----------   ");
//
//		}
		}
	}
}