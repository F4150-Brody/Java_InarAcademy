package weeks.week_04;

public class IntwQues2 {

	public static void main(String[] args) {
		String abc = "Merhaba benim adim mustafa buraya ankara dan geliyorum" 
				+ " Inar Academy";
		interview2(abc);
	}
	
	public static void interview2(String s) {
		
		
		String result = s.replace('a', 'X');
		result = result.replace('A', 'X');
		result = result.replace('e', 'X');
		result = result.replace('E', 'X');
		result = result.replace('i', 'X');
		result = result.replace('I', 'X');
		result = result.replace('o', 'X');
		result = result.replace('O', 'X');
		result = result.replace('u', 'X');
		result = result.replace('U', 'X');
		
		System.out.println("String: " + s);
		System.out.println("Result: " + result);
		
		
		
		
	}

}
