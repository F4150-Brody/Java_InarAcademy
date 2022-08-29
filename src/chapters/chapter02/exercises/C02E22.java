package chapters.c02Exercises;

 import java.util.Scanner;

public class C02E22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in integer, for example (1156 cent): ");
		int amount = input.nextInt();

		int dollars = amount / 100;
		int remaningValue = amount % 100;

		int quarters = remaningValue / 25;
		remaningValue = remaningValue % 25;

		int dimes = remaningValue / 10;
		remaningValue = remaningValue % 10;

		int nickels = remaningValue / 5;
		remaningValue = remaningValue % 5;

		int pennies = remaningValue;

		System.out.println("Your amount " + amount + " consist of:");
		System.out.println("\t" + dollars + " dollars");
		System.out.println("\t" + quarters + " quarters");
		System.out.println("\t" + dimes + " dimes");
		System.out.println("\t" + nickels + " nickels");
		System.out.println("\t" + pennies + "pennies");

	}

}
