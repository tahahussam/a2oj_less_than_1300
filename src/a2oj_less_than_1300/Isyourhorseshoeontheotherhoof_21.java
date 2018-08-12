package a2oj_less_than_1300;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Isyourhorseshoeontheotherhoof_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> unique = new HashSet<>();

		int count = 0;
		for (int i = 0; i < 4; i++) {
			int beforeSize = unique.size();
			unique.add(scanner.nextInt());
			int afterSize = unique.size();
			if (beforeSize == afterSize)
				count++;
		}

		System.out.println(count);

		scanner.close();
	}

}
