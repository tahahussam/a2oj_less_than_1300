package a2oj_less_than_1300;

import java.util.Scanner;

public class ArrivaloftheGeneral_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int idxMax = 0, idxMin = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, temp;

		for (int i = 0; i < n; i++) {
			temp = scanner.nextInt();

			if (temp > max) {
				idxMax = i;
				max = temp;
			}
			if (temp <= min) {
				idxMin = i;
				min = temp;
			}
		}

		if (idxMax > idxMin)
			System.out.println((idxMax + (n - 1 - idxMin) - 1));
		else
			System.out.println((idxMax + (n - 1 - idxMin)));
		scanner.close();
	}
}
