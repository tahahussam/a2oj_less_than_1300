package a2oj_less_than_1300;

import java.util.Scanner;

public class HQ9_26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String p = scanner.nextLine();

		char charI;
		for (int i = 0; i < p.length(); i++) {
			charI = p.charAt(i);
			if (charI == 'H' || charI == 'Q' || charI == '9') {
				System.out.println("YES");
				scanner.close();
				return;
			}
		}
		System.out.println("NO");
		scanner.close();
	}
}