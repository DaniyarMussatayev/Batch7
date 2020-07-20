package com.syntax.class25;

public class ComputerTest {
	public static void main(String[] args) {
		Computer[] s = { new Apple("Apple", 128), new Lenovo("Lenovo", 256), new HP("HP", 512),
				new Dell("Dell", 256) };
		for (Computer obj : s) {
			obj.color();

		}
	}
}
