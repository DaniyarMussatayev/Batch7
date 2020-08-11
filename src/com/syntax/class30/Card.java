package com.syntax.class30;

public abstract class Card {

	// Create a Card class that will have implemented and unimplemented methods and
	// a constructor that will initializes credit card type. Create 3 subclasses of
	// a Card card. Create 3 objects of different card and store them into
	// LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	// the class.

	String type;

	public Card(String type) {
		this.type = type;
	}

	public void getCash() {
		System.out.println("You can get cash from " + type);
	}

	public abstract void getBalance();
}

class Visa extends Card {

	public Visa(String type) {
		super(type);
	}

	@Override
	public void getBalance() {
		System.out.println("Check your" + type+ " balance");

	}

}

class MasterCard extends Card {

	public MasterCard(String type) {
		super(type);
	}

	@Override
	public void getBalance() {
		System.out.println("Check your" + type+ " balance");

	}

}

class AmericanExpress extends Card {

	public AmericanExpress(String type) {
		super(type);
	}

	@Override
	public void getBalance() {
		System.out.println("Check your" + type+ " balance");

	}

}
