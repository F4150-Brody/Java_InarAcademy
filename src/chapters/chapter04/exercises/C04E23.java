package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTax = input.nextDouble();
		
		double grossPay = hours * payRate;
		double fedDeduc = grossPay * fedTax;
		double stateDeduc = grossPay * stateTax;
		double totalDeduc = fedDeduc + stateDeduc;
		double netPay = grossPay - totalDeduc;
		
		System.out.print("Employee Name: " + name);
		System.out.print("\nHours Worked: " + hours);
		System.out.printf("\nPay Rate: $%4.2f", payRate);
		System.out.printf("\nGross Pay: $%4.1f", grossPay);
		System.out.print("\nDeductions: ");
		System.out.print("\n\tFederal Withholding (" + (fedTax * 100) + "%): " + fedDeduc);
		System.out.print("\n\tState Withholding (" + (stateTax * 100) + "%): ");
		System.out.printf("%4.2f", stateDeduc);
		System.out.printf("\n\tTotal Deduction: $%5.2f", totalDeduc);
		System.out.printf("\nNetpay: $%5.2f", netPay);
		
	}
	

}
