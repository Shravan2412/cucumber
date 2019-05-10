package org.Kutty;

public class Company implements Employe {

	@Override
	public void savings() {
		System.out.println("7");
	}

	@Override
	public void deposit() {
		System.out.println("9");
	}
	public void fixed() {
		System.out.println("88");
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.savings();
		c.deposit();
		c.fixed();
	}
}
