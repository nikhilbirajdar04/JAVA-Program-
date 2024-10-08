// Base class
class Animal {
    String name;

    // Constructor for Animal
    Animal(String name) {
        this.name = name;
    }

    // Method in Animal
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class
class Mammal extends Animal {
    int age;

    // Constructor for Mammal
    Mammal(String name, int age) {
        super(name); // Call the constructor of Animal
        this.age = age;
    }

    // Method in Mammal
    void walk() {
        System.out.println(name + " is walking.");
    }
}

// Sub-derived class
class Dog extends Mammal {
    String breed;

    // Constructor for Dog
    Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of Mammal
        this.breed = breed;
    }

    // Method in Dog
    void bark() {
        System.out.println(name + " is barking. Breed: " + breed);
    }

    // Method to display all information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }
}

// Sub-sub-derived class
class Puppy extends Dog {
    String trainingLevel;

    // Constructor for Puppy
    Puppy(String name, int age, String breed, String trainingLevel) {
        super(name, age, breed); // Call the constructor of Dog
        this.trainingLevel = trainingLevel;
    }

    // Method in Puppy
    void play() {
        System.out.println(name + " is playing. Training Level: " + trainingLevel);
    }

    // Method to display all information (override)
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Training Level: " + trainingLevel);
    }
}

// Main class to test the inheritance
public class MultilevelInheritance{
    public static void main(String[] args) {
        // Create a Puppy object
        Puppy myPuppy = new Puppy("Buddy", 1, "Golden Retriever", "Intermediate");

        // Call methods from all levels
        myPuppy.eat();    // From Animal
        myPuppy.walk();   // From Mammal
        myPuppy.bark();   // From Dog
        myPuppy.play();   // From Puppy
        System.out.println();

        // Display complete information
        myPuppy.displayInfo();
    }
}
