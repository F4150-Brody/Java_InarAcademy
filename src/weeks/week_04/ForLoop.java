package weeks.week_04;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		String s = "TarikInarAcademy";
		int length = s.length();

		for (int i = 0; i < length; i = i + 2) {

			System.out.print(s.charAt(i));
		}

	}
}
