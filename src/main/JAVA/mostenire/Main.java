package main.JAVA.mostenire;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish = new Fish("Nemo", 1 ,1, 2, 8, 11);
        fish.swim(5);
        fish.rest();
    }
}