package chapters.c02Exercises;

import java.util.Scanner;

public class C02E06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int firstNumber = input.nextInt();
		int digit1 = firstNumber % 10;
		int number = firstNumber / 10;
		int digit2 = number % 10;
		int digit3 = number / 10;
		int sumOfDigits = digit1 + digit2 + digit3;
		System.out.println("The sum of digits is " + sumOfDigits);
		
	}

}
