public class P7_Method {
        // Method without parameters
    public static void greet() {
        System.out.println("Hello, welcome to the Java program!");
    }

    // Method with parameters
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    // Method with return type
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Calling method without parameters
        greet();

        // Calling method with parameters
        addNumbers(5, 10);

        // Calling method with return type and displaying the result
        int result = multiplyNumbers(4, 7);
        System.out.println("The product of 4 and 7 is: " + result);
    }
}
