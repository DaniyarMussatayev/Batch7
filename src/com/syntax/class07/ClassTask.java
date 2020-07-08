package com.syntax.class07;

public class ClassTask {
	public static void main(String[] args) {
		int x = 50;

		while (x >= 1) {
			System.out.print(x + " ");
			x--;
		}

		System.out.print("\n");
		int y = 1;
		while (y <= 19) {
			System.out.print(y + " ");
			y += 2;
		}
		System.out.println();
		int z = 1;
		while (z < 20) {
			if (z % 2 == 1) {
				System.out.print(z + " ");
			}
			z += 2;
		}
		System.out.print("\n");

		int v = 0;
		while (v < 20) {
			v++;
			System.out.print(v + " ");
			v++;
		}
		System.out.print("\n");

		int g = 0;
		while (g < 20) {

			System.out.print(++g + " ");
			g++;
		}

	}
}
