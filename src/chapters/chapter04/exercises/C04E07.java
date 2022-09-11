package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		double angle = 18;
		angle = Math.toRadians(angle);
		double radiansOf72 = Math.toRadians(72);
		
		
		double x1, x2, x3, x4, x5, y1, y2, y3, y4, y5;
		
		x1 = radius * Math.cos(angle);
		y1 = radius * Math.sin(angle);
		angle = angle + radiansOf72;

		x2 = radius * Math.cos(angle);
		y2 = radius * Math.sin(angle);
		angle = angle + radiansOf72;
		
		x3 = radius * Math.cos(angle);
		y3 = radius * Math.sin(angle);
		angle = angle + radiansOf72;

		x4 = radius * Math.cos(angle);
		y4 = radius * Math.sin(angle);
		angle = angle + radiansOf72;

		x5 = radius * Math.cos(angle);
		y5 = radius * Math.sin(angle);
		
		x1 = (int)(x1 * 100) / 100;
		x2 = (int)(x2 * 100) / 100;
		x3 = (int)(x3 * 100) / 100;
		x4 = (int)(x4 * 100) / 100;
		x5 = (int)(x5 * 100) / 100;
		y1 = (int)(y1 * 100) / 100;
		y2 = (int)(y2 * 100) / 100;
		y3 = (int)(y3 * 100) / 100;
		y4 = (int)(y4 * 100) / 100;
		y5 = (int)(y5 * 100) / 100;
		
		System.out.println("The coordinates of five points on the pentagon are: ");
		System.out.println("p1 " + x1 + ", " + y1);
		System.out.println("p2 " + x2 + ", " + y2);
		System.out.println("p3 " + x3 + ", " + y3);
		System.out.println("p4 " + x4 + ", " + y4);
		System.out.println("p5 " + x5 + ", " + y5);
	}

}
