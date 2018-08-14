package a2oj_less_than_1300;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Drinks_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n, count = 0.0d;
		n = scanner.nextDouble();

		for (int i = 0; i < n; i++)
			count += scanner.nextDouble();

		DecimalFormat df = new DecimalFormat(".000000000000");
		System.out.println(df.format(count / n));

		scanner.close();
	}
}
