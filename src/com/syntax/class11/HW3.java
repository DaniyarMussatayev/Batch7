package com.syntax.class11;

public class HW3 {
	public static void main(String[] args) {
		int[][] arrays = { { 10, 5, 1, 0 }, { 6, 10, 2, 30 }, { 15, 100, 36, 48 } };
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] % 2 == 0 && arrays[i][j] != 0) {
					System.out.print(arrays[i][j] + " ");
				}
			}
		}
	}

}
