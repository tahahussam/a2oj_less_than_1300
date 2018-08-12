package a2oj_less_than_1300;

import java.util.Scanner;

public class Beautiful_Year_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();

		y++;
		while (!isDistinct(y))
			y++;

		System.out.println(y);
		scanner.close();
	}

	private static boolean isDistinct(int num) {
		boolean[] digits = new boolean[10];
		String s = String.valueOf(num);
		for (int i = 0; i < s.length(); i++) {
			if (digits[s.charAt(i) - '0'])
				return false;
			else
				digits[s.charAt(i) - '0'] = true;
		}
		return true;
	}
}