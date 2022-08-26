package chapters.c02Exercises;

import java.util.Scanner;

public class C02E04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pound = input.nextDouble();
		
		double kg = pound * 0.454;
		System.out.println(pound + " pounds is " + kg + " kilograms.");
		
		
	}

}
