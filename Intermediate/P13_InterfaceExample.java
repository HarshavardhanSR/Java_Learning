// Define an interface
interface Animal {
    // Abstract method (no implementation)
    void sound();
    
    // Default method with implementation
    default void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Implementing class Dog
class Dog implements Animal {
    // Implementing the abstract method from the interface
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Implementing class Cat
class Cat implements Animal {
    // Implementing the abstract method from the interface
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class P13_InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
        dog.sleep();  // Output: This animal is sleeping
        
        Cat cat = new Cat();
        cat.sound();  // Output: Cat meows
        cat.sleep();  // Output: This animal is sleeping
    }
}
