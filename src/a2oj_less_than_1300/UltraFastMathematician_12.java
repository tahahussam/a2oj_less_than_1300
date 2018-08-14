package a2oj_less_than_1300;

import java.util.Scanner;

public class UltraFastMathematician_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();

		StringBuffer res = new StringBuffer();
		for (int i = 0; i < s1.length(); i++)
			res.append(s1.charAt(i) - '0' ^ s2.charAt(i) - '0');

		System.out.println(res.toString());
		scanner.close();
	}

}
