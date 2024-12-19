
// Parent class (Superclass)
class Animal {
    // Method in the superclass
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overriding the sound() method
class Dog extends Animal {
    // Overriding the sound() method of the Animal class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat overriding the sound() method
class Cat extends Animal {
    // Overriding the sound() method of the Animal class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class P9_OverridingDemo {
    public static void main(String[] args) {
        // Creating an object of Dog and calling the overridden method
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks
        
        // Creating an object of Cat and calling the overridden method
        Animal myCat = new Cat();
        myCat.sound();  // Output: Cat meows
        
        // Creating an object of Animal and calling the method (no override)
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Output: Animal makes a sound
    }
}
