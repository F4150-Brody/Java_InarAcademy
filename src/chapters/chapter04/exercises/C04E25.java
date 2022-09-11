package chapters.chapter04.exercises;

public class C04E25 {

	public static void main(String[] args) {
		int l1 = (int)(Math.random() * 26) + 65;
		char ch1 = (char)l1;
		int l2 = (int)(Math.random() * 26) + 65;
		char ch2 = (char)l2;
		int l3 = (int)(Math.random() * 26) + 65;
		char ch3 = (char)l3;
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);
		int digit4 = (int)(Math.random() * 10);
		System.out.println("Generated plate is \t" + ch1 + ch2 + ch3 + " " + digit1 + digit2 + digit3 + digit4);
	}

}
