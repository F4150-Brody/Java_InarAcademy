package chapters.c03Exercises;

import java.util.Scanner;

public class C03E06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		System.out.println("Enter feet: ");
		double feet = input.nextDouble();
		System.out.println("Enter inches: ");
		double inches = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		final double FEET_PER_INCH = 12;
		
		double weightInKg = weightPounds * KILOGRAMS_PER_POUND;
		double heightInMeter =( feet * FEET_PER_INCH + inches ) * METER_PER_INCH;
		
		double bmi = weightInKg / Math.pow(heightInMeter, 2);
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else 
			System.out.println("Obese");
		
	}

}
