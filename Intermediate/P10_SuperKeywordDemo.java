// Base class
class Animal {
    String name;

    // Constructor of superclass
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    // Method of superclass
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    String breed;

    // Constructor of subclass, calling superclass constructor using super
    public Dog(String name, String breed) {
        super(name);  // Calling superclass constructor
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    // Overriding method sound() of superclass
    @Override
    void sound() {
        super.sound();  // Calling superclass method using super
        System.out.println("Dog barks");
    }
}

public class P10_SuperKeywordDemo {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Buddy", "Golden Retriever");
        
        // Calling overridden method sound()
        dog.sound();  // Output: Animal makes a sound \n Dog barks
    }
}
