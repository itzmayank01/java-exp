package project;

import java.util.Scanner;
public class Week {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter Your number(1-7):");
		int num1 = scanner.nextInt();
		
		switch (num1) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		
		}
	}
}
