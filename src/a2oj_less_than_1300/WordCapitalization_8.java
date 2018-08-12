package a2oj_less_than_1300;

import java.util.Scanner;

public class WordCapitalization_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(s.toUpperCase().charAt(0) + s.substring(1));

		scanner.close();
	}
}
