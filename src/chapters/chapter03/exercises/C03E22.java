package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		
		System.out.print("Point (" + x + ", " + y + ") is ");
		if (distance <= 10) {
			System.out.println("in the circle");
		} else System.out.println("not in the circle");
				
		
	}

}
