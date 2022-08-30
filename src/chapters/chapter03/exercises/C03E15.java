package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E15 {

	public static void main(String[] args) {
		System.out.println("WELCOME TO LOTTERY GAME");
		int lottery = (int) (Math.random() * 1000);

		int d1 = lottery / 100;
		int remaningDigit = lottery % 100;
		int d2 = remaningDigit / 10;
		int d3 = remaningDigit % 10;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 digits in order:");
		int g1 = input.nextInt();
		int g2 = input.nextInt();
		int g3 = input.nextInt();
		
		System.out.println("Lottery number " + lottery);

		if (d1 == g1 && d2 == g3 && d3 == g3) {
			System.out.println("Exact match: You win $10_000");
		} else if ((d1 == g1 && d2 == g3 && d3 == g2) || (d1 == g2 && d2 == g1 && d3 == g3)
				|| (d1 == g3 && d2 == g2 && d3 == g1) || (d1 == g2 && d2 == g3 && d3 == g1)
				|| (d1 == g3 && d2 == g1 && d3 == g2 )) {
			System.out.println("Match all digits: You win $3_000");
		} else if ((d1 == g1) || (d1 == g2) || (d1 == g3) || (d2 == g1) || (d2 == g2)
				|| (d2 == g3) || (d3 == g1) || (d3 == g2) || (d3 == g3)) {
			System.out.println("Match one digit: You win $1_000");
		} else System.out.println("Sorry, no match");

	}

}
