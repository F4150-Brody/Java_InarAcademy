package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int a = input.nextInt();
		if (a < 0 || a > 127) {
			System.out.println("!!wrong input!!");
		} else {
			char ch = (char)a;
			System.out.println("The character for ASCII code " + a + " is " + ch);
		}
		
		
		
	}

}
