
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class to test
public class Lab3_1 {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        myCar.drive();
    }
}
