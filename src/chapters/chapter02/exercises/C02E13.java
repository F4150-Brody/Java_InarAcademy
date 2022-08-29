package chapters.c02Exercises;

import java.util.Scanner;

public class C02E13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the montly saving amount: ");
		double savingMonthly = input.nextDouble();

		double montlyInterestRate = 0.00417;

		double month1 = savingMonthly * (1 + montlyInterestRate);
		double month2 = (savingMonthly + month1) * (1 + montlyInterestRate);
		double month3 = (savingMonthly + month2) * (1 + montlyInterestRate);
		double month4 = (savingMonthly + month3) * (1 + montlyInterestRate);
		double month5 = (savingMonthly + month4) * (1 + montlyInterestRate);
		double month6 = (savingMonthly + month5) * (1 + montlyInterestRate);

		System.out.println("After the sixth month, the account value is $" + (int)(month6 * 100) / 100.0);
	}

}
