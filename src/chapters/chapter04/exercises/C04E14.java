package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String s = input.next().toUpperCase();
		char ch = s.charAt(0);
		
		if ((ch >= 'A' && ch <= 'D') || (ch == 'F')) {
			switch (ch) {
			case 'A': System.out.println("The numeric value for grade " + ch + " is 4");break;
			case 'B': System.out.println("The numeric value for grade " + ch + " is 3");break;
			case 'C': System.out.println("The numeric value for grade " + ch + " is 2");break;
			case 'D': System.out.println("The numeric value for grade " + ch + " is 1");break;
			case 'F': System.out.println("The numeric value for grade " + ch + " is 0");break;
			default: 
			}
		} else {
			System.err.println(ch + " is an invalid grade");
		}
		
	}

}
