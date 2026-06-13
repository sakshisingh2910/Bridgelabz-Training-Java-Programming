
// Custom Exception
class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingBlocks{

    // throws keyword
    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            // throw keyword
            throw new InvalidAgeException(
                    "Age must be 18 or above");
        }

        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Checking age...");
            checkAge(16);
            System.out.println("After checkAge");

        }
        catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program Ended");
    }
}

