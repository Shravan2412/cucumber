package org.Kutty;

public class HighestNo1 {
	public static void main(String[] args) {
		int a[] = { 20, 10, 30, 25 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}

		}
		System.out.println(max);

	}
}
