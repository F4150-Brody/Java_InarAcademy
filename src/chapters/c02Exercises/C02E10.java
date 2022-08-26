package chapters.c02Exercises;

import java.util.Scanner;

public class C02E10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kg: ");
		double m = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double intemp = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double fintemp = input.nextDouble();
		
		double q = m * (fintemp - intemp) * 4184;
		System.out.println("The energy needed is " + q);
		
		
	}

}
