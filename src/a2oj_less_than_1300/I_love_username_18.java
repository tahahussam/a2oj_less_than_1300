package a2oj_less_than_1300;

import java.util.Scanner;

public class I_love_username_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(), temp;
		int max = scanner.nextInt(), min = max;

		int count = 0;
		for (int i = 1; i < n; i++) {
			temp = scanner.nextInt();
			if (temp > max) {
				max = temp;
				count++;
			}

			if (temp < min) {
				min = temp;
				count++;
			}
		}
		System.out.println(count);
		scanner.close();

	}

}
