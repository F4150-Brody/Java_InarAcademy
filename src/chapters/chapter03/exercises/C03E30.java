package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		long toplamMiliSaniye = System.currentTimeMillis();

		long toplamSaniye = toplamMiliSaniye / 1000;
		long mevcutSaniye = toplamSaniye % 60;

		long toplamDakika = toplamSaniye / 60;
		long mevcutDakika = toplamDakika % 60;

		long toplamSaat = toplamDakika / 60;
		long mevcutSaat = toplamSaat % 60;

		long mevcutSaatForOffset = mevcutSaat + offset;
		
		if (mevcutSaatForOffset < 12) {
			System.out.println("The current time is " + mevcutSaatForOffset + ":" + mevcutDakika + ":" + mevcutSaniye + " AM");
		} else {
			mevcutSaatForOffset -= 12;
			System.out.println("The current time is " + mevcutSaatForOffset + ":" + mevcutDakika + ":" + mevcutSaniye + " PM");
		}

		

	}

}
