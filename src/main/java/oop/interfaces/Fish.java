package oop.interfaces;

public class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("*The fish is fleeing from a larger fish*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting smaller fish*");
    }
}
