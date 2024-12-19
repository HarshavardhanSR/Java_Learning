class Parent {
    Parent() {
        System.out.println("Parent Default Constructor called.");
    }

    Parent(String message) {
        System.out.println("Parent Parameterized Constructor called with message: " + message);
    }
}

class P4_Chained_Constructor extends Parent {
    P4_Chained_Constructor() {
        super("Hello from Parent!"); // Chaining to Parent's Parameterized Constructor
        System.out.println("Child Default Constructor called.");
    }

    P4_Chained_Constructor(String message) {
        this(); // Chaining to Child's Default Constructor
        System.out.println("Child Parameterized Constructor called with message: " + message);
    }

    public static void main(String[] args) {
        new P4_Chained_Constructor();              // Calls Parent's parameterized and Child's default
        new P4_Chained_Constructor("Hello, Java!");// Calls Parent's parameterized and both Child's constructors
    }
}
