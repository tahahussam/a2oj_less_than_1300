package a2oj_less_than_1300;

import java.util.Scanner;

public class NearlyLuckyNumber_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		int count = 0;
		int num;
		for (int i = 0; i < s.length(); i++) {
			num = s.charAt(i) - '0';
			if (num == 7 || num == 4)
				count++;

			if (count > 7)
				break;
		}

		if (count == 4 || count == 7)
			System.out.println("YES");
		else
			System.out.println("NO");

		scanner.close();

	}

}
