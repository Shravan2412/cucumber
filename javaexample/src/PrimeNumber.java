
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 11;

		boolean isPrime = true;

		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime)
			System.out.println("PrimeNumber");
		else
			System.out.println("Not a PrimeNumber");

	}
}
