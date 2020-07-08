package com.syntax.class04;

public class Mortgage {
	public static void main(String[] args) {
		double mortgageRate = 2.5;
		double mortgagePrice = 250000;
		
		if (mortgageRate > 4.5 ) {
			System.out.println("I will not buy a house");
			
		} else {
		System.out.println("I will buy the house");
		if (mortgagePrice > 200000) {
			System.out.println("I need a loan");
		} else {
			System.out.println("I will use cash");
		}
		}
	}

}
