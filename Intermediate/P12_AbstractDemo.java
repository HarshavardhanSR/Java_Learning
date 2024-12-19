
// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Regular method with implementation
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Subclass of Animal
class Dog extends Animal {
    // Providing implementation of the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Providing implementation of the abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class P12_AbstractDemo {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // This will give an error because Animal is abstract.

        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
        dog.eat();    // Output: This animal is eating.

        Cat cat = new Cat();
        cat.sound();  // Output: Cat meows
        cat.eat();    // Output: This animal is eating.
    }
}

