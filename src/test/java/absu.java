abstract class Vehicle {
    public abstract void move();

    public void fuelType() {
        System.out.println("This vehicle uses fuel.");
    }
}
public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car moves on four wheels.");
    }
}
public class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike moves on two wheels.");
    }
}
public class absu {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.move();         // Output: Car moves on four wheels.
        myCar.fuelType();     // Output: This vehicle uses fuel.

        Vehicle myBike = new Bike();
        myBike.move();        // Output: Bike moves on two wheels.
        myBike.fuelType();    // Output: This vehicle uses fuel.
    }
}
//An abstract class in Java is a class that cannot be instantiated on its own. It is designed to be a superclass (base class) from which other classes
//can inherit. Abstract classes are used to define a common interface and provide shared functionality that other classes can extend.


