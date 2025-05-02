package Experiment4;


class Worker {
 String name;
 double salaryRate;

 public Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 public double computePay(int hours) {
     return salaryRate * hours;
 }

 public void displayPay(int hours) {
     System.out.println(name + " earns $" + computePay(hours) + " for " + hours + " hours.");
 }
}

class DailyWorker extends Worker {
 public DailyWorker(String name, double dailyRate) {
     super(name, dailyRate); 
 }

 public double computePay(int hours) {
     int daysWorked = hours / 8; 
     return salaryRate * daysWorked;
 }
}

class SalariedWorker extends Worker {
 public SalariedWorker(String name, double weeklyRate) {
     super(name, weeklyRate);
 }

 public double computePay(int hours) {
     return salaryRate; 
 }
}

   
