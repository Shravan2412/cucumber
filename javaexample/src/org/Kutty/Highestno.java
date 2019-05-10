package org.Kutty;

public class Highestno {

	public static void main(String[] args) {
		int[] x = { 30, 60, 50, 65, 70 };
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (max <= x[i]) {
				max = x[i];
			}

		}
		System.out.println(max);

	}
}