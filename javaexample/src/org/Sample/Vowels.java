package org.Sample;

public class Vowels {

	public static void main(String[] args) {
		String s = "this is shravan";
		int count = 0;
		int a = 0;
		int e = 0;
		int ii = 0;
		int o = 0;
		int u = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				count = count + 1;
				
				if (ch == 'a') {
					a = a + 1;
				}
				if (ch == 'e') {
					e = e + 1;
				}
				if (ch == 'i') {
					ii = ii + 1;
				}
				if (ch == 'o') {
					o = o + 1;
				}
				if (ch == 'u') {
					u = u + 1;
				}
				String x = s.substring(i, i + 1).toUpperCase();

				System.out.print(x);

			} else {

				String sl = s.substring(i, i + 1).toLowerCase();
				System.out.print(sl);
			}
		}
		System.out.println(" ");
		System.out.println("a vowel count is " + a);
		System.out.println("e vowel count is " + e);
		System.out.println("i vowel count is " + ii);
		System.out.println("o vowel count is " + o);
		System.out.println("u vowel count is " + u);

		System.out.println("Total vowels count is " + count);

	}

}
