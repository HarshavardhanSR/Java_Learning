// Program to find the size of all data types in java
public class P4_Size {
    public static void main(String[] args) {
        // Primitive data types
        short shortValue = 32000; // 16-bit signed integer
        int intValue = 123456789; // 32-bit signed integer
        long longValue = 123456789L; // 64-bit signed integer
        float floatValue = 3.14f; // 32-bit floating-point
        double doubleValue = 3.14159265359; // 64-bit floating-point
        char charValue = 'A'; // 16-bit Unicode character
        boolean booleanValue = true; // Boolean value
        byte byteValue = 127; // 8-bit signed integer
        // Displaying primitive data types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        // Reference data types
        int[] intArray = {1, 2, 3, 4, 5}; // Array of integers
        String stringValue = "Hello, World!"; // String object
        // Displaying reference data types
        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringValue);
        System.out.print("Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
