package chapters.c02Exercises;

import java.util.Scanner;

public class C02E17 {

	public static void main(String[] args) {

		double temperature, windSpeed, wci;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58℉ and 41℉ : ");
		temperature = input.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = input.nextDouble();

		wci = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + wci);

	}

}
