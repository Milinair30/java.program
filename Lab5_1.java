// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

// Main class to test the program
public class Lab5_1 {

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}


}
