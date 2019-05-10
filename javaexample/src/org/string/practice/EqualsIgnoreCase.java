package org.string.practice;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String a= "dhoni";
		System.out.println(a);
		boolean b=a.equalsIgnoreCase("dhoni");
		System.out.println(b);
		boolean b1=a.equalsIgnoreCase("Dhoni");
		System.out.println(b1);
	}

}
