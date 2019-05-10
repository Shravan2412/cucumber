package org.string.practice;

public class FirstletterCaps {

	public static void main(String[] args) {
String s="hi this is dhoni";
String[] x=s.split(" ");
for (int i=0;i<x.length;i++) {
	String w=x[i];
	int l=w.length();
	String su=w.substring(0, 1).toUpperCase();
String sl=w.substring(1,l).toLowerCase();
System.out.print(su + sl);	
System.out.print(" " );
}
	}

}
