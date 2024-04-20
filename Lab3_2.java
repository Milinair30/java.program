
class Shape {
    public double getArea() {
        return 0; // Default implementation for base class
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea() to calculate area of rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}


public class Lab3_2 {
    public static void main(String[] args) {
      
        Rectangle rectangle = new Rectangle(5, 10);
        
        double area = rectangle.getArea();
        System.out.println("Area of rectangle: " + area);
    }
}
