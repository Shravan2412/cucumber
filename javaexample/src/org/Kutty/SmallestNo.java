package org.Kutty;

public class SmallestNo {

	public static void main(String[] args) {
int[] x= {10,20,40,5,100,6,1};
int max=x[0];
for(int i=0;i<x.length;i++) {
	if(max>=x[i]) {
		max=x[i];
	}
}
System.out.println(max);
	}

}
