package chapters.c02Exercises;

import java.util.Scanner;

public class C02E05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate(%): ");
		double subtotal = input.nextDouble();
		int gratuityRate = input.nextInt();

		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

	}

}
