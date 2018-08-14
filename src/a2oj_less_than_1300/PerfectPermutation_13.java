package a2oj_less_than_1300;

import java.util.Scanner;

public class PerfectPermutation_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n % 2 == 1) {
			System.out.println("-1");
			return;
		}
		for (int i = n; i > 0; i--)
			System.out.print(i + " ");

		scanner.close();
	}

}
