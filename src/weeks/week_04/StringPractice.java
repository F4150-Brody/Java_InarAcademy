package weeks.week_04;

public class StringPractice {

	public static void main(String[] args) {
		
		concat();
		
		
	}
	public static void concat() {
		String temp1 = "Inar";
		String temp3 = "Inar Academy";
		System.out.println(temp1.concat(temp3));
	}
	
	public static void toUpperCase() {
		String a = "Inar Academy";
		System.out.println(a.toUpperCase());
	}
	
	public static void toLowerCase() {
		String a = "Inar Academy";
		System.out.println(a.toLowerCase());
	}
	
	public static void charAt() {
		String a = "merhabalar";
		System.out.println(a.charAt(5));
	}
	
	public static void trim() {
		String a = "  \n \t selamlar  nasılsınız? \f";
		System.out.println(a.trim());
	}
	
	public static void contains() {
		String temp1 = "Inar";
		String temp3 = "Inar Academy";
		System.out.println(temp3.contains(temp1));
		
	}
	
	public static void equalsIgnoreCase() {
		String temp1 = "Inar";
		String temp2 = "InAr";
		String temp3 = "Inar Academy";
		System.out.println(temp1.equalsIgnoreCase(temp3.substring(0, 4)));
		System.out.println(temp2.equals(temp3.substring(0, 4)));
	}
	
	public static void substring( ) {
		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println(temp);
		System.out.println(yeni);
	}
	
	public static void length() {
		
		String temp = "I love Inar Academy";
		
		int length = temp.length();
		
		System.out.println(length);
	}

}
