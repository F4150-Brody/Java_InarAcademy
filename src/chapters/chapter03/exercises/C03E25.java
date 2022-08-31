package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter (x1, y1), (x2, y2), (x3, y3), (x4, y4): ");
		double x1, x2, x3, x4, y1, y2, y3, y4;
		x1 = input.nextDouble();
		y1 = input.nextDouble();

		x2 = input.nextDouble();
		y2 = input.nextDouble();

		x3 = input.nextDouble();
		y3 = input.nextDouble();

		x4 = input.nextDouble();
		y4 = input.nextDouble();

		double x = (y1 - y2) * x1 - (x1 - x2) * y1 + (y3 - y4) * x3 - (x3 - x4) * y3 + y * ();

	}

}
