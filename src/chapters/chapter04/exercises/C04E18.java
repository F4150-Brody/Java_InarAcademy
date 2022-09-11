package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String s = input.next();
		s = s.toUpperCase().substring(0, 2);
		char m = s.charAt(0);
		char st = s.charAt(1);
		
		String major = "";
		String status = "";
		
		switch (m) {
		case 'M': major = "Mathematics"; break;
		case 'C': major = "Computer Science"; break;
		case 'I': major = "Information Technology"; break;
		default: System.err.println("Wrong Input");
		System.exit(1);		
		}
		
		switch (st) {
		case '1': status = "Freshman"; break;
		case '2': status = "Sophomore"; break;
		case '3': status = "Junior"; break;
		case '4': status = "Senior"; break;
		default: System.err.println("Wrong Input");
		System.exit(1);	
		}
		
		System.out.println(major + " " + status);
	}

}
