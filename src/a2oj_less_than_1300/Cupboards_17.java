package a2oj_less_than_1300;

import java.util.Scanner;

public class Cupboards_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int temp, leftOpen = 0, rightOpen = 0;

		for (int i = 0; i < n; i++) {
			temp = scanner.nextInt();
			if (temp == 1)
				leftOpen++;
			temp = scanner.nextInt();
			if (temp == 1)
				rightOpen++;
		}

		System.out.println(Math.min(leftOpen, n - leftOpen) + Math.min(rightOpen, n - rightOpen));

		scanner.close();
	}

}
