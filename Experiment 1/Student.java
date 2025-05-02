package project;

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter the First number :");
	double subject1 = scanner.nextDouble();
	
	System.out.println("Enter the Second number :");
	double subject2 = scanner.nextDouble();
	
	System.out.println("Enter the Third number :");
	double subject3 = scanner.nextDouble();
	
    double Average = (subject1 + subject2 + subject3)/3;
    
    System.out.println(""+Average);
	
    if(Average>=90) {
    System.out.println("Your grade is A");
    }
    else if(Average>=75) {
    System.out.println("Your grade is B");
    }
    else if(Average>=50) {
    System.out.println("Your grade is C");
    }
    else {
    System.out.println("Your grade is F");
    }
	}
}
