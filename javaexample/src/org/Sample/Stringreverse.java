package org.Sample;

public class Stringreverse {

	public static void main(String[] args) {
String s="this is shravan";
String[] x=s.split(" ");
for(int i=x.length-1;i>=0;i--) {
	String w=x[i];
	System.out.print(w + " ");
}
	}

}
