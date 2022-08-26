package chapters.c01Exercices;

public class B01A11 {
	public static void main(String[] args) {
		double sinay;
		double curpop;
		double biay;
		double diay;
		double iiay;
		
		double y1;
		double y2;
		double y3;
		double y4;
		double y5;
		

		sinay = 60 * 60 * 24 * 365;   // second in a year
		curpop = 312032486;
		biay = curpop / 7;            //birth in a year
		diay = curpop / 13;           //death in a year
		iiay = curpop / 45;           //immigrant in a year
		
		System.out.println("Current population is " + (int)curpop );
		
		y1 = curpop + biay - diay + iiay;
		System.out.println("Projection of Year-1 is " + (int)y1 );
		
		
		
		

	}

}
