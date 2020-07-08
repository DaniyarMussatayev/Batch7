package com.syntax.class10;

public class ArrayAnotherWay {
	public static void main(String[] args) {
		
		// created an array and stored the initial values
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		double[] balances = {10000, 23.5, 5540};
		System.out.println("total money is " + (balances[0] + balances[1] + balances[2]));
		double total = balances[0] + balances[1] + balances[2];
		System.out.println("total money is " + total);
	}

}
