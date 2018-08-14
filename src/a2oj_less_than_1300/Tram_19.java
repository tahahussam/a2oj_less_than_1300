package a2oj_less_than_1300;

import java.util.Scanner;

public class Tram_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0, sum = 0;
		int temp;
		for (int i = 0; i < n; i++) {
			temp = scanner.nextInt();

			sum -= temp;

			temp = scanner.nextInt();

			sum += temp;

			res = Math.max(res, sum);
		}
		System.out.println(res);
		scanner.close();
	}

}
