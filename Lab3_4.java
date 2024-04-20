// Parent class Animal
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}


public class Lab3_4 {
    public static void main(String[] args) {
        
        Cat cat = new Cat();
      
        cat.makeSound();
    }
}
