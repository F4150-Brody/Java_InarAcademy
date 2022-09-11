package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String s = input.next();
		char ch = s.toLowerCase().charAt(0);

		if (ch <= 'z' && ch >= 'a') {
			switch (ch) {
			case 'a':
			case 'b':
			case 'c':
				System.out.println("The corresponding number is 2");
				break;
			case 'd':
			case 'e':
			case 'f':
				System.out.println("The corresponding number is 3");
				break;
			case 'g':
			case 'h':
			case 'i':
				System.out.println("The corresponding number is 4");
				break;
			case 'j':
			case 'k':
			case 'l':
				System.out.println("The corresponding number is 5");
				break;
			case 'm':
			case 'n':
			case 'o':
				System.out.println("The corresponding number is 6");
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				System.out.println("The corresponding number is 7");
				break;
			case 't':
			case 'u':
			case 'v':
				System.out.println("The corresponding number is 8");
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.println("The corresponding number is 9");
				break;

			}
		} else {
			System.err.println(ch + " is an invalid input!");
		}
	}

}
