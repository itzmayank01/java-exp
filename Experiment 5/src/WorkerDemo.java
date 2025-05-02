package Experiment4;

public class WorkerDemo {
	   public static void main(String[] args) {
	     
	     Worker dWorker = new DailyWorker("John", 100);  
	     Worker sWorker = new SalariedWorker("Alice", 2000); 

	     dWorker.displayPay(40);  
	     sWorker.displayPay(40);  
	 }
	}