package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String s = input.next();
		char ch = s.charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch + " is a vowel");
			} else {
				System.out.println(ch + " is a consonant");
			}
		} else if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel");
			} else {
				System.out.println(ch + " is a consonant");
			}

		} else {
			System.err.println(ch + " Is Wrong Input!!");
		}

	}
}
