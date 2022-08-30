package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperature, windSpeed, wci;
		
		System.out.print("Enter the temperature in Fahrenheit between -58℉ and 41℉ : ");
		temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = input.nextDouble();

		wci = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		
		if (temperature > - 58 && temperature < 41 && windSpeed >= 2) {
			System.out.println("The wind chill index is " + wci);
		} else System.out.println("The temperature and/or wind speed is invalid.");
	}

}
