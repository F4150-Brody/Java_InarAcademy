package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three edges of the triangle: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("Perimeter of triangle is " + (a + b + c));
		} else System.out.println("The input is invalid.");
	}

}
