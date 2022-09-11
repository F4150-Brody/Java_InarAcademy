package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int i = input.nextInt();
		
		if (i > 15 || i < 0) {
			System.err.println(i + " is an invalid input!");
		} else if (i >= 0 && i <= 9) {
			System.out.println("The hex value is " + i);
		} else {
			i = i - 10;
			i = 'A' + i;
			System.out.println((char)i);
		}
	}

}
