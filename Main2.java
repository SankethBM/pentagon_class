class Vehicle {
	String brand;
	String model;
	int year;

	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void displayDetails() {
		System.out.println(brand + " " + model + " " + year);
	}
}

class Car2 extends Vehicle {
	int numOfDoors;

	public Car2(String brand, String model, int year, int numOfDoors) {
		super(brand, model, year);
		this.numOfDoors = numOfDoors;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details : "); 
		super.displayDetails();
		System.out.println(numOfDoors);
	}

}

class Truck extends Vehicle {

	int payloadCapacity;

	public Truck(String brand, String model, int year, int payloadCapacity) {
		super(brand, model, year);
		this.payloadCapacity = payloadCapacity;
	}

	@Override
	public void displayDetails() {
		System.out.println("Truck Details : ");
		super.displayDetails();
		System.out.println(payloadCapacity);
	}

}

public class Main2 {
	public static void main(String[] args) {
		Car2 c = new Car2("BMW", "M%", 2020, 4);
		Truck t = new Truck("TATA", "T%", 2021, 200);

		c.displayDetails();
		t.displayDetails();

	}
}
