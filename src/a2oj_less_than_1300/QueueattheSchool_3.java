package a2oj_less_than_1300;

import java.util.Scanner;

public class QueueattheSchool_3 {

	private static String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		t = scanner.nextInt();
		scanner.nextLine();
		String queue = scanner.nextLine();

		while (t-- > 0) {
			for (int i = 0; i < queue.length() - 1; i++) {
				if (queue.charAt(i) == 'B' && queue.charAt(i + 1) == 'G') {
					queue = swap(queue, i, i + 1);
					i++;
				}
			}
		}
		System.out.println(queue);
		scanner.close();
	}
}
