// Encapsulation Example with all types of Inner Classes

class OuterClass {
    // Encapsulation: Private fields and getter/setter methods
    private String outerField = "Outer Field";

    // Getter and Setter for encapsulation
    public String getOuterField() {
        return outerField;
    }

    public void setOuterField(String outerField) {
        this.outerField = outerField;
    }

    // Member Inner Class: Non-static class that has access to instance members of the outer class
    class MemberInnerClass {
        void display() {
            System.out.println("Member Inner Class - Accessing outerField: " + outerField);
        }
    }

    // Static Nested Class: Static class that can access only static members of the outer class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class - Cannot access non-static outerField directly.");
        }
    }

    void outerMethod() {
        // Local Inner Class: Defined inside a method, can access local final variables
        final String localVariable = "Local Variable";

        class LocalInnerClass {
            void display() {
                System.out.println("Local Inner Class - Accessing localVariable: " + localVariable);
            }
        }

        // Creating object of LocalInnerClass and calling display method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    void demonstrateAnonymousInnerClass() {
        // Anonymous Inner Class: Creating an object of an interface and overriding method
        Runnable anonymousInnerClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class - Running from anonymous class!");
            }
        };

        // Running the anonymous inner class
        anonymousInnerClass.run();
    }
}

public class P14_Classes {
    public static void main(String[] args) {
        // Demonstrating Encapsulation
        OuterClass outer = new OuterClass();
        outer.setOuterField("Updated Outer Field");
        System.out.println("Encapsulation - Outer Field: " + outer.getOuterField());

        // Demonstrating Member Inner Class
        OuterClass.MemberInnerClass memberInner = outer.new MemberInnerClass();
        memberInner.display();

        // Demonstrating Static Nested Class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Demonstrating Local Inner Class
        outer.outerMethod();

        // Demonstrating Anonymous Inner Class
        outer.demonstrateAnonymousInnerClass();
    }
}
