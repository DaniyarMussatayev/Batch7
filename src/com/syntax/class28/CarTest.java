package com.syntax.class28;

public class CarTest {
	public static void main(String[] args) {
		Car s = new Sedan(20000, "Blue", 21);
		System.out.println("Sedan price is "+s.calculateSalePrice());
		
		Car t = new Truck(100000, "White", 2200);
		System.out.println("Truck price is "+t.calculateSalePrice());
	}

}
