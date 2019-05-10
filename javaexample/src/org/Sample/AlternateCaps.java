package org.Sample;

public class AlternateCaps {

	public static void main(String[] args) {
		String s = "abcdefghij";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				String x = s.substring(i, i+1).toUpperCase();
				System.out.print(x);
			}
			else
			{
				String m=s.substring(i,i+1).toLowerCase();
				System.out.print( m);
			}

		}
	}
}