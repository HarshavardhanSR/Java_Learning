public class P3_Constructor {
      int x; // Instance variable

    // 1. Default Constructor
    P3_Constructor() {
        System.out.println("Default Constructor called.");
        x = 0; // Default initialization
    }

    // 2. No-Argument Constructor
    P3_Constructor(String message) {
        System.out.println("No-Argument Constructor called with message: " + message);
        x = 10; // Specific default value
    }

    // 3. Parameterized Constructor
    P3_Constructor(int value) {
        System.out.println("Parameterized Constructor called with value: " + value);
        x = value; // Initializing with parameter
    }

    // 4. Copy Constructor
    P3_Constructor(P3_Constructor obj) {
        System.out.println("Copy Constructor called.");
        this.x = obj.x; // Copying value from another object
    }

    // Method to display the value of x
    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        P3_Constructor obj1 = new P3_Constructor();
        obj1.display(); // Output: 0

        // Using No-Argument Constructor
        P3_Constructor obj2 = new P3_Constructor("Hello, Java!");
        obj2.display(); // Output: 10

        // Using Parameterized Constructor
        P3_Constructor obj3 = new P3_Constructor(42);
        obj3.display(); // Output: 42

        // Using Copy Constructor
        P3_Constructor obj4 = new P3_Constructor(obj3); // Copying obj3
        obj4.display(); // Output: 42
    }
}
