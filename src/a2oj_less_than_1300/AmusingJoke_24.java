package a2oj_less_than_1300;

import java.util.Scanner;

public class AmusingJoke_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String pipe = scanner.nextLine();

		int[] arr = new int[26];

		for (int i = 0; i < pipe.length(); i++)
			arr[pipe.charAt(i) - 'A']++;

		for (int i = 0; i < a.length(); i++)
			arr[a.charAt(i) - 'A']--;

		for (int i = 0; i < b.length(); i++)
			arr[b.charAt(i) - 'A']--;

		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				System.out.println("NO");
				scanner.close();
				return;
			}
		}
		System.out.println("YES");
		scanner.close();
	}

}
