package chapters.c02Exercises;

import java.util.Scanner;

public class C02E21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  investment amount: ");
		double interestAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double anInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		double futureInvesmentValue = interestAmount * Math.pow(1 + (anInterestRate / 1200) , numberOfYears * 12);
		
		System.out.println("Accumulated value is " + (int)(futureInvesmentValue * 100) / 100.0);
		
	}

}
