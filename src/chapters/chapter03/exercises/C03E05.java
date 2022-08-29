package chapters.c03Exercises;

import java.util.Scanner;

public class C03E05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day (0-6): ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int dayElapsed = input.nextInt();
		 
		int totalDay = today + dayElapsed;
		totalDay %= 7;
		
		switch (today) {
		case 1: System.out.print("Today is Monday"); break;
		case 2: System.out.print("Today is Tuesday"); break;
		case 3: System.out.print("Today is Wednesday"); break;
		case 4: System.out.print("Today is Thursday"); break;
		case 5: System.out.print("Today is Friday"); break;
		case 6: System.out.print("Today is Saturday"); break;
		case 0: System.out.print("Today is Sunday"); break;
		}
		
		switch (totalDay) {
		case 1: System.out.print(" and the future day is Monday"); break;
		case 2: System.out.print(" and the future day is Tuesday"); break;
		case 3: System.out.print(" and the future day is Wednesday"); break;
		case 4: System.out.print(" and the future day is Thursday"); break;
		case 5: System.out.print(" and the future day is Friday"); break;
		case 6: System.out.print(" and the future day is Saturday"); break;
		case 0: System.out.print(" and the future day is Sunday"); break;
		
		}
		
		
	}

}
