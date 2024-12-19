// Custom checked exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom unchecked exception class
class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class P17_Types_of_Exception {

    // Method demonstrating a checked exception (InvalidAgeException)
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    // Method demonstrating an unchecked exception (NegativeAmountException)
    public static void validateAmount(int amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        } else {
            System.out.println("Amount is valid: " + amount);
        }
    }

    // Method demonstrating an error (StackOverflowError)
    public static void causeStackOverflowError() {
        causeStackOverflowError(); // This will lead to a StackOverflowError
    }

    public static void main(String[] args) {
        // Checked Exception Example
        try {
            validateAge(15);  // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Checked Exception: " + e.getMessage());  // Catching the custom checked exception
        }

        // Unchecked Exception Example
        try {
            validateAmount(-100);  // This will throw NegativeAmountException
        } catch (NegativeAmountException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());  // Catching the custom unchecked exception
        }

        // Error Example
        try {
            causeStackOverflowError();  // This will cause a StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e.getMessage());  // Catching the error
        }

        System.out.println("Program continues after handling exceptions and errors.");
    }
}
