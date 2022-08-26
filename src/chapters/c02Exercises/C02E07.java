package chapters.c02Exercises;

import java.util.Scanner;

public class C02E07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minute = input.nextInt();
		int year = minute / (60 * 24 * 365);
		int dayM = minute % (60 * 24 * 365);
		int day = dayM / (60 * 24);
		System.out.println(minute + " minutes is " + year + " years " + day + " days.");
	}

}
