
// Base class
abstract class Shape1
{
    abstract void draw();

    abstract double calculateArea();
}
class Circle1 extends Shape1 {
     double radius;
    Circle1(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    double calculateArea() {
        return Math.PI * radius * radius; // Area of circle
    }
}
class Cylinder extends Circle1 {
    double height1;
    Cylinder(double radius, double height1) {
        super(radius);
        this.height1 = height1;
    }
    @Override
    void draw() {
        System.out.println("Drawing Cylinder");
   }
 double calculateArea() {
        // Surface area of cylinder = 2πr^2 + 2πrh
 return 2 * Math.PI * super.radius * super.radius + 2 * Math.PI * super.radius * height1;
    }
}

public class Example5 {
    public static void main(String[] args) {

        Circle1 circle = new Circle1(5);
        Cylinder cylinder = new Cylinder(3, 7);
        System.out.println("Circle:");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nCylinder:");
        cylinder.draw();
        System.out.println("Total Surface Area: " + cylinder.calculateArea());
    }
}
