package org.Sample;

public class AlternateCaps1 {

	public static void main(String[] args) {
String s="abcdefghi";
for(int i=0;i<s.length();i++) {
	if(i%2==0) {
		String a=s.substring(i, i+1).toUpperCase();
		System.out.print(a+ " ");
	}
	else {
		String b=s.substring(i, i+1).toLowerCase();
		System.out.print(b+ " ");
	}
}
	}

}
