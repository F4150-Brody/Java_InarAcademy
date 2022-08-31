package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		double circle1CenterX = input.nextDouble();
		double circle1CenterY = input.nextDouble();
		double circle1Radius = input.nextDouble();

		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		double circle2CenterX = input.nextDouble();
		double circle2CenterY = input.nextDouble();
		double circle2Radius = input.nextDouble();

		double distanceOfCenters = Math
				.sqrt(Math.pow(circle2CenterX - circle1CenterX, 2) + Math.pow(circle2CenterY - circle1CenterY, 2));
		
		boolean c2Inc1 = (circle1Radius - circle2Radius > distanceOfCenters);
		boolean c1Inc2 = (circle2Radius - circle1Radius > distanceOfCenters);
		boolean inTangent_c1 = (circle1Radius - circle2Radius == distanceOfCenters);
		boolean inTangent_c2 = (circle2Radius - circle1Radius == distanceOfCenters);
		boolean overlap = (circle1Radius + circle2Radius > distanceOfCenters );
		boolean tangent = (circle1Radius + circle2Radius == distanceOfCenters);
		
		if (c2Inc1) {
			System.out.println("circle2 is inside circle1");
		} else if (c1Inc2) {
			System.out.println("circle1 is inside circle2");
		} else if (inTangent_c1) {
			System.out.println("circle2 is inside circle1 _ _ c1 and c2 are tangent  ");
		} else if (inTangent_c2) {
			System.out.println("circle1 is inside circle2 _ _ c1 and c2 are tangent  ");
		} else if (overlap) {
			System.out.println("circle1 and circle2 overlap");
		} else if (tangent) {
			System.out.println("circle1 and circle2 tangent");
		} else {
			System.out.println("circle1 and circle2 does not overlap");
		}

	}

}
