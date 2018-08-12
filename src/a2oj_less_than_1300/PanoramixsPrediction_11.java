package a2oj_less_than_1300;

import java.util.Scanner;

public class PanoramixsPrediction_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };

		for (int i = 0; i < primes.length - 1; i++)
			if (primes[i] == n && primes[i + 1] == m) {
				System.out.println("YES");
				scanner.close();
				return;
			}
		System.out.println("NO");

		scanner.close();

	}
}