package chapters.c02Exercises;

import java.util.Scanner;

public class C02E23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.println("Enter miles per gallon: ");
		double efficiency = input.nextDouble();

		System.out.println("Enter price per gallon: ");
		double priceOfGallon = input.nextDouble();

		double costOfTrip = distance / efficiency * priceOfGallon;
		System.out.println("The cost of driving is " + (int)(costOfTrip * 100) / 100.0);
	}

}
