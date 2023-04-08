package day23abstraction;

public class Dog extends Mammal{

    @Override
    public void move() {
        System.out.println("Dogs move...");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat...");
    }
}
