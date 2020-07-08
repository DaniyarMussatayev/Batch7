package com.syntax.class10;

public class ClassTask {
	public static void main(String[] args) {

		for (int row = 1; row <= 4; row++) {
			
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
		}
			for (int i = 4; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
