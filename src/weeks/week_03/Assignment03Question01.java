package week_03;

import java.util.Scanner;

public class Assignment03Question01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your year of service: ");

		int yearOfService = input.nextInt();

		if (yearOfService > 5) {
			System.out.print("Enter your salary: ");
			double salary = input.nextDouble();
			double bonus = salary * 0.05;
			System.out.println("Your net bonus amount: " + bonus + "$");

		} else
			System.out.println("We regret to inform you that you don't have a bonus salary.");

	}

}
