import java.util.Scanner;

public class VotingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Voting Application!");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(age);
            System.out.println("Congratulations! You are eligible to vote.");
            
        } catch (AgeBelowThresholdException e) {
            System.out.println(e.getMessage());
            System.out.println("Terminating the program.");
        } finally {
            scanner.close(); 
        }
    }

    public static void checkEligibility(int age) throws AgeBelowThresholdException {
        if (age < 18) {
            throw new AgeBelowThresholdException("Sorry, you must be at least 18 years old to vote.");
        }
    }

    
    static class AgeBelowThresholdException extends Exception {
        public AgeBelowThresholdException(String message) {
            super(message);
        }
    }
}
