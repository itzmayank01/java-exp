package project;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the radius:");
		int Radius = scanner.nextInt();
		
		
		System.out.println("Enter the Length of the Rectangle:");
		int Length = scanner.nextInt();
		
		System.out.println("Enter the Breadth of the Rectangle:");
		int Breadth = scanner.nextInt();
		
		
		System.out.println("Enter the side of the square:");
		int Side = scanner.nextInt();
		
		
		System.out.println("Enter the Base of the triangle:");
		int Base = scanner.nextInt();
		
		System.out.println("Enter the Perpendicular of the triangl:");
		int Perpendicular = scanner.nextInt();
		
		
		double circle=Radius*3.14;
	    int square=Side*Side;
	    int rectangle=Length*Breadth;
	    double Triangle= 0.5*(Base + Perpendicular);
		
		
		System.out.println("The Area of the circle is :"+circle);
		System.out.println("The Area of the square is :"+square);
		System.out.println("The Area of the rectangle is :"+rectangle);
		System.out.println("The Area of the triangle is :"+Triangle);
			
	}
}
