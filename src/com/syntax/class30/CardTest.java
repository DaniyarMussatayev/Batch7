package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {
	public static void main(String[] args) {
		LinkedList<Card> card = new LinkedList<>();
		card.add(new Visa("Visa"));
		card.add(new MasterCard("MasterCard"));
		card.add(new AmericanExpress("AmericanExpress"));

		System.out.println("--------------for loop-----------------");
		for (int i = 0; i < card.size(); i++) {
			card.get(i).getCash();
			card.get(i).getBalance();
		}

		System.out.println("--------------for each loop-----------------");
		for (Card card2 : card) {
			card2.getCash();
			card2.getBalance();
		}

		System.out.println("--------------using Iterator-----------------");
		Iterator<Card> it = card.iterator();
		while(it.hasNext()) {
			Card c = it.next();
			c.getCash();
			c.getBalance();
		}

	}
}
