package test;

public class Calculator {

	public static void main(String[] args) {
		
//		System.out.println("Hello World!");
		
//		1. Get the number of hours worked
		int hours = 40;
		
//		2. Get the hourly pay rate
		double payRate = 25.50;
		
//		3. Multiply the hours and pay rate
		double grossPay = hours * payRate;
		
//		4. Display Result 
		System.out.println("Your GrossPay is : " + grossPay);	
	}
}
