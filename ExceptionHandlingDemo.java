public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            
            divideByZero();
        } catch (DivideByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void divideByZero() throws DivideByZeroException {
        int numerator = 10;
        int denominator = 0;

        if (denominator == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }

        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    // Custom Exception
    static class DivideByZeroException extends Exception {
        public DivideByZeroException(String message) {
            super(message);
        }
    }
}
