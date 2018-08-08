package a2oj_less_than_1300;

import java.util.Scanner;

public class Chat_room_58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String hello = "hello";
		String s = scanner.nextLine();
		int j = 0;
		for (int i = 0; i < s.length() && j < hello.length(); i++) {
			if (s.charAt(i) == hello.charAt(j))
				j++;
		}
		if (j == 5)
			System.out.println("YES");
		else
			System.out.println("NO");

		scanner.close();
	}

}
