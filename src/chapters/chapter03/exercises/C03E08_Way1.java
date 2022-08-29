package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E08_Way1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 integer: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int max, min, mid;

		if (number1 > number2 && number1 > number3) {
			max = number1;
			if (number2 > number3) {
				min = number3;
				mid = number2;
			} else {
				min = number2;
				mid = number3;
			}
		} else if (number2 > number1 && number2 > number3) {
			max = number2;
			if (number1 > number3) {
				min = number3;
				mid = number1;
			} else {
				min = number1;
				mid = number3;
			}

		} else {
			max = number3;
			if (number2 > number1) {
				min = number1;
				mid = number2;
			} else {
				min = number2;
				mid = number1;
			}
		}
		System.out.println(min + " " + mid + " " + max);
	}

}
