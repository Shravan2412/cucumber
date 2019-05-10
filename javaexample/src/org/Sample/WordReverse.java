package org.Sample;

public class WordReverse {

	public static void main(String[] args) {
		String s = "this is shravan";
		String[] x = s.split(" ");
		for (int i = x.length-1; i >= 0; i--) {
			String w = x[i];
			
for (int j = w.length() - 1; j >= 0; j--) {
				
				char ch = w.charAt(j);
				
				System.out.print(ch);
			
			}
			System.out.println();
		}
		
		}
	}
