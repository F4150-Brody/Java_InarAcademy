package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println("Enter a month:");
		String month = input.next();
		int day = 0;
		
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			day = 31;
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			day = 30;
			break;
		case "Feb":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				day = 29;
			} else {
				day = 28;
			}
			break;			
		default: System.err.println("Wrong Input");	
		System.exit(1);
		}
		
		System.out.println(month + " " + year + " has " + day + " days");
		
	}

}
