package oop.constructors;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Petch", 26, 63.3);
        Human human2 = new Human("Boon", 27, 58.9);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();

    }
}
