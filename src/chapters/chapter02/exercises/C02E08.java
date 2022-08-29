package chapters.c02Exercises;

import java.util.Scanner;

public class C02E08 {

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
		
		
		System.out.println("The current time is " + mevcutSaatForOffset + ":" + mevcutDakika + ":" + mevcutSaniye);
		
		
	}

}
