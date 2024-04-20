import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        double greatestNumber = num1;

        if (num2 > greatestNumber) {
            greatestNumber = num2;
        }

        if (num3 > greatestNumber) {
            greatestNumber = num3;
        }

        // Print the result
        System.out.println("The greatest number is: " + greatestNumber);
        scanner.close();
    }
}
