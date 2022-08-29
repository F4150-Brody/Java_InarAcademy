package chapters.c02Exercises;

import java.util.Scanner;

public class C02E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight_P = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height_I = input.nextDouble();

		double weight_Kg = weight_P * 0.45359237;
		double height_M = height_I * 0.0254;
		double bmi = weight_Kg / Math.pow(height_M, 2);
		System.out.print("BMI is " + (int)(bmi * 100) / 100.0);

	}

}
