package org.string.practice;

public class PrintFirstLetter {

	public static void main(String[] args) {
String s="this is dhoni";
String[] x=s.split(" ");

for(int i=0; i<x.length; i++)
{
	char ch = x[i].charAt(0);
	System.out.println(ch);
}
	}

}
