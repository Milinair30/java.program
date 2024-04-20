
// Parent class
class Employee {
    // Method in the parent class
    double calculateSalary() {
        return 0.0; // Default salary
    }
}

// Subclass Manager inheriting from Employee
class Manager extends Employee {
    private double baseSalary;

    // Constructor
    Manager(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    @Override
    double calculateSalary() {
        // Manager salary calculation (e.g., adding bonus)
        double bonus = 0.1 * baseSalary; // 10% bonus
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    private double monthlyHoursWorked;
    private double hourlyRate;

    // Constructor
    Programmer(double monthlyHoursWorked, double hourlyRate) {
        this.monthlyHoursWorked = monthlyHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    @Override
    double calculateSalary() {
        // Programmer salary calculation (e.g., based on hours worked)
        return monthlyHoursWorked * hourlyRate;
    }
}

public class Example {
    public static void main(String[] args) {
       
        Manager manager = new Manager(5000);
        System.out.println("Manager's Salary: " + manager.calculateSalary());
       
        Programmer programmer = new Programmer(160, 25);
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}
