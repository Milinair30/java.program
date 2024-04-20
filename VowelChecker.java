public class VowelChecker {

    public static void main(String[] args) {
        String testString1 = "Hello";  
        String testString2 = "Fly";   

        try {
            checkForVowels(testString1);
            System.out.println(testString1 + " contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkForVowels(testString2);
            System.out.println(testString2 + " contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws NoVowelsException {
        if (!containsVowels(str)) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
    }

    public static boolean containsVowels(String str) {
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    
    static class NoVowelsException extends Exception {
        public NoVowelsException(String message) {
            super(message);
        }
    }
}
