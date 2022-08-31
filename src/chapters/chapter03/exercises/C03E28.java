package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter R1's center x-, y- coordinates, width, and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1w = input.nextDouble();
		double r1h = input.nextDouble();

		System.out.print(" Enter R2's center x-, y- coordinates, width, and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2w = input.nextDouble();
		double r2h = input.nextDouble();

		double r1WidthMax = r1x + r1w / 2;
		double r1WidthMin = r1x - r1w / 2;
		double r1HeightMax = r1y + r1h / 2;
		double r1HeightMin = r1y - r1h / 2;

		double r2WidthMax = r2x + r2w / 2;
		double r2WidthMin = r2x - r2w / 2;
		double r2HeightMax = r2y + r2h / 2;
		double r2HeightMin = r2y - r2h / 2;

		boolean r2InsideR1 = (r1WidthMax >= r2WidthMax) && (r1WidthMin <= r2WidthMin) && (r1HeightMax >= r2HeightMax)
				&& (r1HeightMin <= r2HeightMin);
		boolean outside = (r1WidthMax < r2WidthMin) || (r1WidthMin > r2WidthMax) || (r1HeightMax < r2HeightMin)
				|| (r1HeightMin > r2HeightMax);
		boolean r1InsideR2 = (r2WidthMax >= r1WidthMax) && (r2WidthMin <= r1WidthMin) && (r2HeightMax >= r1HeightMax)
				&& (r2HeightMin <= r1HeightMin);
		
		if (r2InsideR1) {
			System.out.println("r2 is inside r1 ");
		} else if (r1InsideR2) {
			System.out.println("r1 is inside r2 ");
		} else if(outside) {
			System.out.println("r1 and r2 does not overlap ");
		} else {
			System.out.println("r2 and r1 overlap");
		}

	}

}
