package chapters.c03Exercises;

import java.util.Scanner;

public class C03E02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		
		System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " = ?");
		int answer = input.nextInt();
		
		if (num1 + num2 + num3 == answer) {
			System.out.println("You are correct!!!");
		} else {
			System.out.println("Your answer is wrong");
			System.out.println(num1 + " + " + num2 + " + " + num3 + "\tis\t" + (num1 + num2 + num3));
		}
		
	}
}
