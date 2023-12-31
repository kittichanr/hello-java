package oop.array_objects;

public class Main {
    public static void main(String[] args) {
        // -- Method 1 --
//        Food[] refrigerator = new Food[3];
//
//        Food food1 = new Food("Pizza");
//        Food food2 = new Food("Hamburger");
//        Food food3 = new Food("HotDog");
//
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
//
//        System.out.println(refrigerator[0].name);
//        System.out.println(refrigerator[1].name);
//        System.out.println(refrigerator[2].name);

        // -- Method 2 --

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("HotDog");


        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
