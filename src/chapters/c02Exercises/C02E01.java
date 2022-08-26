package chapters.c02Exercises;

import java.util.Scanner;

public class C02E01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celcius: ");
		double celcius = input.nextDouble();
		double fahrenayt = (9.0 / 5) * celcius + 32;
		System.out.println(celcius + "℃ is " + fahrenayt + "℉");
	}

}
