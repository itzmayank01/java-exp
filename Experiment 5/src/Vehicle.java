package Experiment4;

class Vehicle {
 String brand, model;
 double price;

 public Vehicle(String brand, String model, double price) {
     this.brand = brand;
     this.model = model;
     this.price = price;
 }

 public void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Price: INR " + price);
 }
}

class Car extends Vehicle {
 int seatingCapacity;
 String fuelType;

 public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
     super(brand, model, price);  
     this.seatingCapacity = seatingCapacity;
     this.fuelType = fuelType;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Seating Capacity: " + seatingCapacity);
     System.out.println("Fuel Type: " + fuelType);
 }
}

class ElectricCar extends Car {
 double batteryCapacity, chargingTime;

 public ElectricCar(String brand, String model, double price, int seatingCapacity, 
                    String fuelType, double batteryCapacity, double chargingTime) {
     super(brand, model, price, seatingCapacity, fuelType); 
     this.batteryCapacity = batteryCapacity;
     this.chargingTime = chargingTime;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
     System.out.println("Charging Time: " + chargingTime + " hours");
 }
}

class Motorcycle extends Vehicle {
 int engineCapacity; 
 String type; 

 public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
     super(brand, model, price);
     this.engineCapacity = engineCapacity;
     this.type = type;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Engine Capacity: " + engineCapacity + " CC");
     System.out.println("Type: " + type);
 }
}



