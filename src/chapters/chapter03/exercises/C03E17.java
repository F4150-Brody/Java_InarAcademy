package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2):");
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3);
		
		if (user == 0) {
			if (computer == 0) {
				System.out.println("The computer is scissor too. It is a draw");
			} else if (computer == 1) {
				System.out.println("The computer is rock. You lost ");
			}
			else System.out.println("The computer is paper. You won");
		} else if (user == 1) {
			if (computer == 0) {
				System.out.println("The computer is scissor. You won");
			} else if (computer == 1) {
				System.out.println("The computer is rock too. It is a draw");
			} else System.out.println("The computer is paper. You lost");
		} else if (user == 2) {
			if (computer == 0) {
				System.out.println("The computer is scissor. You lost");
			} else if (computer == 1) {
				System.out.println("The computer is rock. You won");
			}else System.out.println("The computer is paper too. It is a draw. ");
		} else System.out.println("Wrong number. Please 0, 1 or 2");
		
	}
}
