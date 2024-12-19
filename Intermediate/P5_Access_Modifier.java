
class Parent {
    private int privateVar = 10; // Private member
    int defaultVar = 20;         // Default (Package-Private) member
    protected int protectedVar = 30; // Protected member
    public int publicVar = 40;       // Public member

    // Method to access private variable
    private void privateMethod() {
        System.out.println("Private Method: privateVar = " + privateVar);
    }

    void defaultMethod() { // Default access
        System.out.println("Default Method: defaultVar = " + defaultVar);
    }

    protected void protectedMethod() { // Protected access
        System.out.println("Protected Method: protectedVar = " + protectedVar);
    }

    public void publicMethod() { // Public access
        System.out.println("Public Method: publicVar = " + publicVar);
        privateMethod(); // Access private method internally
    }
}

// Child Class (inherits from Parent)
class Child extends Parent {
    public void accessParentMembers() {
        // System.out.println("privateVar = " + privateVar); // Not accessible
        System.out.println("defaultVar = " + defaultVar); // Accessible (same package)
        System.out.println("protectedVar = " + protectedVar); // Accessible (inherited)
        System.out.println("publicVar = " + publicVar); // Accessible (public)
    }
}

// Main Class
public class P5_Access_Modifier {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Accessing Parent's Members:");

        // parent.privateMethod(); // Not accessible
        // System.out.println("privateVar = " + parent.privateVar); // Not accessible

        parent.defaultMethod(); // Accessible (same package)
        parent.protectedMethod(); // Accessible (same package)
        parent.publicMethod(); // Accessible (public)

        System.out.println("\nAccessing via Child:");
        Child child = new Child();
        child.accessParentMembers(); // Access inherited members
    }
}
