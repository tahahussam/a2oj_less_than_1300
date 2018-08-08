package a2oj_less_than_1300;

import java.util.Scanner;

public class BeautifulMatrix_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int res = 0;
		int i = 0, j = 0;
		for (int k = 0; k < 25; k++) {
			int num = scanner.nextInt();
			if (num == 1)
				res = Math.abs(i - 2) + Math.abs(j - 2);
			j++;
			if (j == 5) {
				j = 0;
				i++;
			}
		}
		System.out.println(res);
		scanner.close();
	}
}
