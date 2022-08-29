package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E08_Way2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 integer:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int temp;
		
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println( a + "\t" + b + "\t" + c);
	}

}
