package weeks.week_04;

public class SadeceUnluHarfler {

	public static void main(String[] args) {
		String deneme = "selamlar iyi misiniz ";
		sadeceUnluHarfler(deneme);
		
		System.out.println("");
		
		sadeceUnsuzHarfler(deneme);

	}
	
	public static void sadeceUnluHarfler(String s) {
		
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char harf = s.charAt(i);
			if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
				System.out.print(harf);
			}
		}
		
		}
	
	public static void sadeceUnsuzHarfler(String s) {

		int l = s.length();
		for (int i = 0; i < l; i++) {
			char harf = s.charAt(i);
			if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
			} else {
				System.out.print(harf);
			}
		}
		
	}

}
