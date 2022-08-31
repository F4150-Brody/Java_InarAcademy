package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int number = input.nextInt();
		
		System.out.print("Is " + number + " divisible by 5 and 6?");
		System.out.println(number % 5 == 0 && number % 6 == 0 ? " true" : " false");
		System.out.print("Is " + number + " divisible by 5 or 6?");
		System.out.println(number % 5 == 0 || number % 6 == 0 ? " true" : " false");
		System.out.print("Is " + number + " divisible by 5 or 6, but not both?");
		System.out.println(number % 5 == 0 ^ number % 6 == 0 ? " true" : " false");
	}

}
