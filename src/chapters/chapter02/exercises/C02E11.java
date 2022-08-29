package chapters.c02Exercises;

import java.util.Scanner;

public class C02E11 {

	public static void main(String[] args) {
		final int START_POP = 312_032_486;
		final double SEC_IN_YEAR = 60 * 60 * 24 * 365;
		final int BIRTH_FAC = 7;
		final int DEATH_FAC = 13;
		final int IMMIG_FAC = 45;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double births = years * (SEC_IN_YEAR / BIRTH_FAC);
		double deaths = years * (SEC_IN_YEAR / DEATH_FAC);
		double immigrants = years * (SEC_IN_YEAR / IMMIG_FAC);
		
		int pop = (int)(START_POP + births - deaths + immigrants);
		System.out.println("The population in " + years + " years is " + pop);
		
		
	}

}
