package Prime_Number_Using_Lambda;

import java.util.Scanner;

public class Prime_Number_Using_Lambda {

	public static void main(String[] args) {
		//PrimeNumber_lamda rime = new PrimeNumber_lamda();
		MathOperation prime_number = (a) -> prime(a);
		// MathOperation prime
		boolean pag = prime_number.operation(3);
		System.out.println(pag);
	}

	interface MathOperation {
		boolean operation(int n);

	}

	static boolean prime(int a) {

		boolean c = true;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;

	}

}