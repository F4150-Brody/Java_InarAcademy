package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String s = input.next();
		char ch = s.charAt(0);
		
		int d1, d2, d3, d4, remaningValue;
		
		if (ch <= '9' && ch >= '0') {
			int i = (int) ch - 48;
			d1 = i / 8;
			remaningValue = i % 8;
			d2 = remaningValue / 4;
			remaningValue = remaningValue % 4;
			d3 = remaningValue / 2;
			d4 = remaningValue % 2;
			
			System.out.println("The binary value is: " + d1 + d2 + d3 + d4);
			

		} else if ((ch <= 'F' && ch >= 'A') || (ch <= 'f' && ch >= 'a')) {
			ch = s.toUpperCase().charAt(0);
			int i = (int)ch - 55;
			d1 = i / 8;
			remaningValue = i % 8;
			d2 = remaningValue / 4;
			remaningValue = remaningValue % 4;
			d3 = remaningValue / 2;
			d4 = remaningValue % 2;
			
			System.out.println("The binary value is: " + d1 + d2 + d3 + d4);
		}
		else {
			System.err.println("!!wrong input!!");
		}

	}

}
