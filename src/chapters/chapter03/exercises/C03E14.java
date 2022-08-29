package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random() * 2);
		
		System.out.println("What is your guess? (1 or 0):");
		int guess = input.nextInt();
		
		System.out.println("Guess is " + (guess == num ? "CORRECT." : "INCORRECT."));
	}

}
