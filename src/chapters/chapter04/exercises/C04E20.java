package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = input.next();
		int length = s.length();
		char firstCharacter = s.charAt(0);
		System.out.println("Length of the string is " + length + " and the first character is " + firstCharacter);
	}

}
