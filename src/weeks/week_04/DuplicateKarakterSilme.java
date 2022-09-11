package weeks.week_04;

public class DuplicateKarakterSilme {
	public static void main(String[] args) {
		deleteDupChar("fsadfasdgasgagasjasşlfşalsdfaljagazxvzxcvzxczbzxs");
	}

	public static void deleteDupChar(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (result.contains("" + s.charAt(i))) {
				
			} else {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
	}
}
