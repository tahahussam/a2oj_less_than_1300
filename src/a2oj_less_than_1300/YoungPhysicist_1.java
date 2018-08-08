package a2oj_less_than_1300;

import java.util.Scanner;

public class YoungPhysicist_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] sum = new int[] { 0, 0, 0 };
		int i = 0;
		while (n > 0) {
			sum[i++ % 3] += scanner.nextInt();

			sum[i++ % 3] += scanner.nextInt();

			sum[i++ % 3] += scanner.nextInt();

			n--;
		}

		for (i = 0; i < 3; i++)
			if (sum[i] != 0) {
				System.out.println("NO");
				scanner.close();
				return;
			}
		System.out.println("YES");
		scanner.close();
	}

}
