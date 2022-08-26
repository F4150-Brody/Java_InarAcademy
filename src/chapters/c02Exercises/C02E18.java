package chapters.c02Exercises;

public class C02E18 {

	public static void main(String[] args) {
		int a, b, p;
		System.out.println("a\tb\tpow(a, b)");
		System.out.println("_________________________");
		
		
		a = 1; b = 2; p = (int)Math.pow(a, b);
		System.out.println(a +"\t" + b + "\t" + p);
		
		a++; b++; p = (int)Math.pow(a, b);
		System.out.println(a +"\t" + b + "\t" + p);
		
		a++; b++; p = (int)Math.pow(a, b);
		System.out.println(a +"\t" + b + "\t" + p);
		
		a++; b++; p = (int)Math.pow(a, b);
		System.out.println(a +"\t" + b + "\t" + p);
		
		a++; b++; p = (int)Math.pow(a, b);
		System.out.println(a +"\t" + b + "\t" + p);
				
	}

}
