import java.util.Scanner;

public class CubeofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        System.out.println("Cube of numbers from 1 to " + inputNumber + ":");

        for (int i = 1; i <= inputNumber; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + " is: " + cube);
        }
    }
}
