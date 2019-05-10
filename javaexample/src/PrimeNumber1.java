import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
int a;
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
a=s.nextInt();
boolean b=true;
for(int i=2;i<a/2;i++) {
	if(a%i==0) {
		b=false;
		System.out.println("not a prime no");

		break;
	}
	
}
if(b) {
	System.out.println("prime no");
}

	}

}
