package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s1 = input.next();
		char ch = s1.charAt(0);
		int i = (int)ch;
		
		System.out.println("The Unicode for the character " + ch + " is " + i);
		
	}

}
