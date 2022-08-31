package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and vice versa: ");
		byte typeOfConvert = input.nextByte();
		
		if (typeOfConvert == 0) {
			System.out.println("Enter the dollar amount: ");
			double dollar = input.nextDouble();
			double result = dollar * rate;
			result = (int)(result * 100) / 100.0;
			System.out.println("$" + dollar + " is " + result + " yuan");
		} else if (typeOfConvert == 1) {
			System.out.println("Enter the RMB amount");
			double rmb = input.nextDouble();
			double result = rmb * (1 / rate);
			result = (int)(result * 100) / 100.0;
			System.out.println( rmb + " yuan is $" + result );
		} else {
			System.out.println("Wrong input");
		}
		
		
		
		
		
	}
}
