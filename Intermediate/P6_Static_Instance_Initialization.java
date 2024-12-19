public class P6_Static_Instance_Initialization {
    // Static variable
    static int staticVar;

    // Instance variable
    int instanceVar;

    // Static Initialization Block
    static {
        System.out.println("Static Initialization Block called.");
        staticVar = 100; // Initialize static variable
    }

    // Instance Initialization Block
    {
        System.out.println("Instance Initialization Block called.");
        instanceVar = 50; // Initialize instance variable
    }

    // Constructor
    P6_Static_Instance_Initialization() {
        System.out.println("Constructor called.");
    }

    // Method to display variable values
    void display() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Create first object
        P6_Static_Instance_Initialization obj1 = new P6_Static_Instance_Initialization();
        obj1.display();

        // Create second object
        P6_Static_Instance_Initialization obj2 = new P6_Static_Instance_Initialization();
        obj2.display();
    }
}
