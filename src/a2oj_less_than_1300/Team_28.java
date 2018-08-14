package a2oj_less_than_1300;

import java.util.Scanner;

public class Team_28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int res = 0, count, temp;
		for (int i = 0; i < n; i++) {
			count = 0;
			temp = scanner.nextInt();
			if (temp == 1)
				count++;
			temp = scanner.nextInt();
			if (temp == 1)
				count++;
			temp = scanner.nextInt();
			if (temp == 1)
				count++;
			
			if (count >= 2)
				res++;
		}
		System.out.println(res);
		scanner.close();

	}
}