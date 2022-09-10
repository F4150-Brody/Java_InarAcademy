package chapter04.exercises;

public class C04E06 {

	public static void main(String[] args) {
		double radius = 40;
		
		double angle1 = Math.random() * 360;
		angle1 = Math.toRadians(angle1);
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		
		double angle2 = Math.random() * 360;
		angle2 = Math.toRadians(angle2);
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		
		double angle3 = Math.random() * 360;
		angle3 = Math.toRadians(angle3);
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);
		
		double d1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double d2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double d3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		
		double a1 = Math.acos((Math.pow(d1, 2) + Math.pow(d2, 2) - Math.pow(d3, 2)) / (2 * d1 * d2) );
		double a2 = Math.acos((Math.pow(d2, 2) + Math.pow(d3, 2) - Math.pow(d1, 2)) / (2 * d2 * d3) );
		double a3 = Math.acos((Math.pow(d3, 2) + Math.pow(d1, 2) - Math.pow(d2, 2)) / (2 * d3 * d1) );
		
		a1 = Math.toDegrees(a1);
		a2 = Math.toDegrees(a2);
		a3 = Math.toDegrees(a3);
		
		System.out.println(a1 + a2 + a3);
		
		System.out.println("Three angles in a triangle formed by random three points is " + a1 + " " + a2 + " " + a3);
	}

}
