package com.syntax.class24;
//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance. 

//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//Call the method by creating an object of each of the three classes.

public class CreditCard {
	double balance, interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}

	protected double dailyInterest() {
		if (balance > 0) {
			balance = balance * ((interest / 365) / 100);
			return balance;
		} else {
			return 0;
		}
	}
}

class Visa extends CreditCard {

	public Visa(double balance) {
		super(balance);
	}

	@Override
	protected double dailyInterest() {
		if (balance > 0) {
			balance = balance * 0.0076;
			return balance;
		} else {
			return 0;
		}
	}
}

class AX extends CreditCard {

	public AX(double balance) {
		super(balance);
		
	}

}
