package com.syntax.class27;


public interface Trustable {
	
	void trust();
}

interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
}

class PNC extends Mortgage implements Bank, Investments {
	
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}
	
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}
//COMPLETE BOA CLASS

//TEST YOUR CODE