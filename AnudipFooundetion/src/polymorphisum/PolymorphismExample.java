package polymorphisum;

//Parent class
class Animal {
 void sound() {  // This method will be overridden
     System.out.println("Animal makes a sound");
 }
}

//Child class 1
class Dog extends Animal {
 @Override
 void sound() {  // Overriding the sound() method
     System.out.println("Dog barks");
 }
}

//Child class 2
class Cat extends Animal {
 @Override
 void sound() {  // Overriding the sound() method
     System.out.println("Cat meows");
 }
}

//Class demonstrating method overloading (Compile-Time Polymorphism)
class Calculator {
 int add(int a, int b) {  // Overloading with 2 parameters
     return a + b;
 }

 int add(int a, int b, int c) {  // Overloading with 3 parameters
     return a + b + c;
 }
}

//Main class

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Compile-Time Polymorphism (Method Overloading)
		Calculator calculator = new Calculator();
		
		System.out.println("Sum of 2 numbers: " + calculator.add(5, 10));       // Calls add(int, int)
        System.out.println("Sum of 3 numbers: " + calculator.add(5, 10, 15));  // Calls add(int, int, int)

        System.out.println();
        
     // Run-Time Polymorphism (Method Overriding)
        Animal myAnimal;  // Parent class reference
        myAnimal = new Dog();  // Dog object assigned
        myAnimal.sound();  // Calls Dog's sound() method

        myAnimal = new Cat();  // Cat object assigned
        myAnimal.sound();  // Calls Cat's sound() method
	}

}
