package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
//		System.out.println("Hello World!");
		
//		1. Get the number of hours worked
		int hours = 0;
		System.out.println("How many hours did you work?");
		
		Scanner scanner = new Scanner(System.in);
		hours = scanner.nextInt();
		
		System.out.println("You work" + " "  + hours + " " + "hours.");
		
//		2. Get the hourly pay rate
		double payRate = 0;
		System.out.println("What's your payrate ?");

		payRate = scanner.nextDouble();
		
		System.out.println("Your payrate is " + payRate);
		
//		3. Multiply the hours and pay rate
		double grossPay = hours * payRate;
		
//		4. Display Result 
		System.out.println("Your GrossPay is : " + grossPay);	
	}
	
}