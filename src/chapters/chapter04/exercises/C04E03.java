package chapters.chapter04.exercises;
public class C04E03 {

	public static void main(String[] args) {
		
		double x1 = 33.748783;
		double y1 = -84.388168;
		
		double x2 = 28.538336;
		double y2 = -81.379234;
		
		double x3 = 32.076176;
		double y3 = -81.088371;
		
		double x4 = 35.227085;
		double y4 = -80.843124;
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		x3 = Math.toRadians(x3);
		x4 = Math.toRadians(x4);
		y3 = Math.toRadians(y3);
		y4 = Math.toRadians(y4);
		double radius = 6_371.01;
		
		double d1 = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		double d2 = radius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
		double d3 = radius * Math.acos(Math.sin(x3) * Math.sin(x1) + Math.cos(x3) * Math.cos(x1) * Math.cos(y3 - y1));
		
		double s1 = (d1 + d2 + d3) / 2;
		double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d3));
		
		
		double d4 = radius * Math.acos(Math.sin(x4) * Math.sin(x2) + Math.cos(x4) * Math.cos(x2) * Math.cos(y4 - y2));
		double d5 = radius * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
		
		double s2 = (d4 + d2 + d5) / 2;
		double area2 = Math.sqrt(s2 * (s2 - d4) * (s2 - d2) * (s2 - d5));
		
		System.out.println("The estimated area enclosed by four cities is " + (area1 + area2));	
		
		
		
		
	}

}
