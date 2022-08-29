package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit number: ");
		int number = input.nextInt();
		
		int d1, d3;
		
		d1 = number / 100;
		d3 = number % 10;
		
		System.out.println(number + (d1 == d3 ? " is a palindrome" : " is not a palindrome"));
	}

}
