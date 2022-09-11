package weeks.week_04;

public class Palindrom {

	public static void main(String[] args) {
		String deneme = "civic";
		isPalindome(deneme);
	}

	public static void isPalindome(String s) {

		boolean isPalindrome = true;
		
		for (int i = 0; i < s.length() / 2; i++) {
			if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
				isPalindrome = false;
			}
			
		}
		if (isPalindrome) {
			System.out.println("palindromdur");
		} else {
			System.out.println("palindrom değil");
		}
	}
}
