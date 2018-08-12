package a2oj_less_than_1300;

import java.util.Scanner;

public class StonesontheTable_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();

		scanner.nextLine();
		String s = scanner.nextLine();

		int count = 0;
		for (int i = 1; i < s.length(); i++)
			if (s.charAt(i) == s.charAt(i - 1))
				count++;

		System.out.println(count);
		scanner.close();
	}
}