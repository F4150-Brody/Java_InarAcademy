package chapters.c02Exercises;

import java.util.Scanner;

public class C02E16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		double area = ((3 * Math.pow(3, 0.5) / 2) ) * Math.pow(s, 2);
		System.out.println("The area of hexagon is " + (int)(area * 100) / 100.0 );
	}

}
