package org.string.practice;

public class PrintLastLetter {

	public static void main(String[] args) {
		String s = " This is Dhoni . This is CSK";
		String[] x = s.split(" ");
		for (int i = x.length - 1; i >= 0; i--) {
			String w = x[i];
			int le = w.length();
			System.out.println(w+" length is "+ le);
			if (le > 0) {
				char ch = w.charAt(le - 1);
				System.out.println(ch + " ");
			}
		}

	}

}
