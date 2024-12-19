// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Single Inheritance
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void sound() {
        System.out.println("Puppy makes a high-pitched bark");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Hybrid Inheritance (combination of multiple inheritance types)
class Bird extends Animal {
    void sound() {
        System.out.println("Bird chirps");
    }
}

class Parrot extends Bird {
    void sound() {
        System.out.println("Parrot squawks");
    }
}

public class P8_InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound
        Dog dog = new Dog();
        dog.sound();  // Dog barks
        
        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.sound();  // Puppy makes a high-pitched bark
        
        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.sound();  // Cat meows
        
        // Hybrid Inheritance
        Bird bird = new Bird();
        bird.sound();  // Bird chirps
        
        Parrot parrot = new Parrot();
        parrot.sound();  // Parrot squawks
    }
}
