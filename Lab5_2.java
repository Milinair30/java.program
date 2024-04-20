// Abstract class Employee
abstract class Employee{
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayInfo();

    // Getters for name and employeeId
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Subclass Manager
class Managr extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Managr(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementing abstract methods
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass Programmer
class Program extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Program(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing abstract methods
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Managr manager = new Managr("Abc", 1001, 5000.0, 1500.0);
        Program programmer = new Program("Xyz", 2001, 30.0, 160);

        manager.displayInfo();
        System.out.println(); 
        programmer.displayInfo();
    }
}


