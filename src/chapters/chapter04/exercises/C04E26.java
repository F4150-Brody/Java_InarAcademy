package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double, for example 11.56: ");
		String amount = input.next();
		int k = amount.indexOf(',');
		int dollars = Integer.parseInt(amount.substring(0, k));
		int cents = Integer.parseInt(amount.substring(k + 1));
		
		int numberOfQuarters = cents / 25;
		cents = cents % 25;
		
		int numberOfDimes = cents / 10;
		cents = cents % 10;
		
		int numberOfNickels = cents / 5;
		cents = cents % 5;
		
		int numberOfPennies = cents;
		
		System.out.println("Your amount " + amount + " consist of\n"
				+ "\t" + dollars + " dollars\n"
				+ "\t" + numberOfQuarters + " quarters\n"
				+ "\t" + numberOfDimes + " dimes\n"
				+ "\t" + numberOfNickels + " nickels\n"
				+ "\t" + numberOfPennies + " pennies\n");
		
		
	}

}
