package chapters.c02Exercises;

import java.util.Scanner;

public class C02E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = (int)(((v1 - v0) / t) * 100) / 100.0;
		System.out.println("The avarage accelaration is " + a);
		
	}

}
