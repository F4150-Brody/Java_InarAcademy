package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.println("What is " + a + " + " + b + " = ? ");
		int answer = input.nextInt();
		
		if (answer == a + b) {
			System.out.println("You are right!");
		} else {
			System.out.println("Wrong!\nAnswer is " + (a + b));
		}
		
		
	}

}
