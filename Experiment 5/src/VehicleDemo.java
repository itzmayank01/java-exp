package Experiment4;

public class VehicleDemo {
	 public static void main(String[] args) {
		 
	     Car car = new Car("Maruti Suzuki", "Swift", 800000, 5, "Petrol");
	     ElectricCar electricCar = new ElectricCar("Tata", "Nexon EV", 1400000, 5, "Electric", 80, 1.5);
	     Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 200000, 155, "Sport");

	     System.out.println("Car Details:");
	     car.displayDetails();
	     System.out.println("\nElectric Car Details:");
	     electricCar.displayDetails();
	     System.out.println("\nMotorcycle Details:");
	     motorcycle.displayDetails();
	 }
	}
