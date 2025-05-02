package Experiment4;

public class Student {
 String name;
 int age;
   
 public Student(){
	this.name = "Harsh";
	this.age= 19;
 }	
 
 public Student( String name, int age) {
	 this.name = name;
	 this.age = age;
 }
 
 public void display (){
	 System.out.println ("Name: " +name + " and his Age is : " +age);
 }
 
public static void main (String [] args) {
	Student student1 = new Student();
	student1.display();
	
	Student student2 = new Student("Pulkit", 20);
	student2.display();
}
}
