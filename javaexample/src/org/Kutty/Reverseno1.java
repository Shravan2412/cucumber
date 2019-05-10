package org.Kutty;

public class Reverseno1 {

	public static void main(String[] args) {
		int s = 1456;
		int j = 0;

		for (int i = 0; i < s; i++) {
			int l = s % 10;
			s = s / 10;
			j = (j * 10) + l;
		}
		System.out.println(j);
	}

}
