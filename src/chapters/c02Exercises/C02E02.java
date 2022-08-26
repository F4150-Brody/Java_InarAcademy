package chapters.c02Exercises;

import java.util.Scanner;

public class C02E02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");

		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;
		System.out.print("The area is " + (int)(area * 100) / 100.0);
		System.out.println("  The volume is " + (int)(volume * 100) / 100.0);
	}

}
