package org.Kutty;

public class Reverseno {

	public static void main(String[] args) {

		int s = 456;
		int j=0;
		while(s>0) {		
		int l = s % 10;
		s = s / 10;  

		j = (j * 10) + l; 
		}
		System.out.println(j);

	}

}
