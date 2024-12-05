package abstarction;

abstract class Vehicle{
	abstract void start();
	
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car starts with key");
	}
}
class Scooter extends Vehicle{
	void start() {
		System.out.println("scooter starts with kick");
	}
	
}

public class vehicle {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Car c=new Car();
	c.start();
	
	Scooter s=new Scooter();
	s.start();
	

	}

}
