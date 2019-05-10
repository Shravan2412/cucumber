package org.string.practice;

public class LengthOfIndividualWord {

	public static void main(String[] args) {
String s="this is java";
String[] x= s.split(" ");
for(int i=0;i<x.length;i++) {
	int z=x[i].length();
	System.out.println(z);
}
	}

}
