package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN (DDD-DD-DDDD): ");
		String ssn = input.next();
		
		if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-' && ssn.length() == 11) {
			System.out.println(ssn + " is a valid social security number");
		} else {
			System.out.println(ssn + " is an invalid social security number");
		}
		
	}

}
