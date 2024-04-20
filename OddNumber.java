public class OddNumber {

    public static void main(String[] args) {
        int number1 = 10;  
        int number2 = 7;   // 

        try {
            checkIfEven(number1);
            System.out.println(number1 + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkIfEven(number2);
            System.out.println(number2 + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number is odd: " + number);
        }
    }

    // Custom Exception
    static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }
}
