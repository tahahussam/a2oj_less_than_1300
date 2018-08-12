package a2oj_less_than_1300;

import java.util.Scanner;

public class Borze_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = s.replace("--", "2");
		s = s.replace("-.", "1");
		s = s.replace(".", "0");
		System.out.println(s);
		scanner.close();
	}
}