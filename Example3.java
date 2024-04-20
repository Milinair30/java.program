// Base class
abstract class Shape {
   
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    // Override calculateArea() method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // Area of circle
    }
}
class Square extends Shape {
    private double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    double calculateArea() {
        return side * side; // Area of square
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height; // Area of triangle
    }
}

public class Example3 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6);

        System.out.println("Circle:");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nSquare:");
        square.draw();
        System.out.println("Area: " + square.calculateArea());

        System.out.println("\nTriangle:");
        triangle.draw();
        System.out.println("Area: " + triangle.calculateArea());
    }
}
