package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double (for example 11.56) :");
		double amount = input.nextDouble();
		
		int remaningAmount = (int)(amount * 100);
		
		int dollar = remaningAmount / 100;
		remaningAmount %= 100;
		
		int quarter = remaningAmount / 25;
		remaningAmount %= 25;
		
		int dime = remaningAmount / 10;
		remaningAmount %= 10;
		
		int nickel = remaningAmount / 5;
		remaningAmount %= 5;
		
		int penny = remaningAmount;
		
		System.out.println("Your amount " + amount + " consist of");
		
		if (dollar == 1) {
			System.out.println(dollar + " dollar");
		} else if (dollar > 1) {
			System.out.println(dollar + " dollars");
		}
		
		if (quarter == 1) {
			System.out.println(quarter + " quarter");
		} else if (quarter > 1) {
			System.out.println(quarter + " quarters");
		}
		
		if (dime == 1) {
			System.out.println(dime + " dime");
		} else if (dime > 1) {
			System.out.println(dime + " dimes");
		}
		
		if (nickel == 1) {
			System.out.println(nickel + " nickel");
		} else if (nickel > 1) {
			System.out.println(nickel + " nickels");
		}
		
		if (penny == 1) {
			System.out.println(penny + " penny");
		} else if (penny > 1) {
			System.out.println(penny + " pennies");
		}
		
		
		
		
		
		
		
	}

}
