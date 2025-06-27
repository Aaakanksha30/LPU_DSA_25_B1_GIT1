public class inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();           
        dobby.legs = 4;        
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammal extends Animal {
    int legs;
}

// Dog class extending Mammal
class Dog extends Mammal {
    String breed;
}
