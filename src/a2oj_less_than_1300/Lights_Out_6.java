package a2oj_less_than_1300;

import java.util.Scanner;

public class Lights_Out_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[][] result = { { true, true, true }, { true, true, true }, { true, true, true } };

		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = scanner.nextInt() % 2;

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] == 1)
					flip(result, i, j);
			}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(result[i][j] ? 1 : 0);
			System.out.println();
		}
		scanner.close();
	}

	private static void flip(boolean[][] result, int i, int j) {
		result[i][j] = !result[i][j];

		int adji = i - 1, adjj = j;

		if (adji >= 0 && adji < 3 && adjj >= 0 && adjj < 3)
			result[adji][adjj] = !result[adji][adjj];

		adji = i + 1;
		adjj = j;

		if (adji >= 0 && adji < 3 && adjj >= 0 && adjj < 3)
			result[adji][adjj] = !result[adji][adjj];

		adji = i;
		adjj = j - 1;

		if (adji >= 0 && adji < 3 && adjj >= 0 && adjj < 3)
			result[adji][adjj] = !result[adji][adjj];

		adji = i;
		adjj = j + 1;

		if (adji >= 0 && adji < 3 && adjj >= 0 && adjj < 3)
			result[adji][adjj] = !result[adji][adjj];

	}
}