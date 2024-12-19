// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class P16_ExceptionExample {

    // Method that throws a custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing a custom exception
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            // Simulate division by zero
            int result = 10 / 0;  // This will throw an ArithmeticException
            System.out.println("Result: " + result);
            
            // Validate age
            validateAge(15);  // This will throw InvalidAgeException
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InvalidAgeException e) {
            // Handling custom exception InvalidAgeException
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("This block will always execute, whether or not an exception occurs.");
        }

        // Code after exception handling
        System.out.println("Program continues after exception handling.");
    }
}

