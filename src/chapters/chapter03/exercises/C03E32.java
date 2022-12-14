package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2: ");
		double x0, y0, x1, y1, x2, y2;
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		double equation = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		boolean leftSide = equation > 0;
		boolean rightSide = equation < 0;
		boolean sameLine = equation == 0;

		if (leftSide) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		} else if (rightSide) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		}else if (sameLine) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		}

	}

}
