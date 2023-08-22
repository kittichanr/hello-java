package org.hellojava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\"Hello JavaR\"");
//        System.out.println("Hello Java2");
//
//        long x = 123123123123123123L;
//        System.out.println("My number is " + x);
//        char symbol = '#';
//        System.out.println(symbol);


// ------------------ Swap 2 variable in Java  -----------------------//
//        String x = "water";
//        String y = "Kool-lit";
//        String temp;
//        temp = x;
//        x = y;
//        y = temp;
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);


// ------------------ Scanner -----------------------//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name");
//        String name = scanner.nextLine();
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like " + food);

//  ------------------ Arithmetic expressions -----------------------//
//        int friends = 10;
//        friends++;

//        double friends = 10;
//        friends = (double) friends / 3;
//        System.out.println(friends);
//
//
//  ------------------ Java GUI -----------------------//
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null,"Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"You are " + age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");
//
//
//  ------------------ Math class -----------------------//
//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x*x) + (y*y));
//        System.out.println("The hypotenuse is: " + z);
//        scanner.close();
//
//  ------------------ Random numbers -----------------------//
//        Random random = new Random();
//        int x = random.nextInt(6) + 1;
//        double y = random.nextDouble();
//        boolean z = random.nextBoolean();
//        System.out.println(z);
//
//
//  ------------------ If statements -----------------------//
//        int age = 26;
//        if (age >= 75) {
//            System.out.println("Ok Boomer!");
//        } else if (age >= 18) {
//            System.out.println("You are an adult!");
//        } else if (age >= 13) {
//            System.out.println("You are a teenager!");
//        } else {
//            System.out.println("You are not an adult!");
//        }
//
//
//  ------------------ Switch case -----------------------//
//        String day = "Monday";
//        switch (day) {
//            case "Sunday":
//                System.out.println("It is Sunday");
//                break;
//            case "Monday":
//                System.out.println("It is Monday");
//                break;
//            case "Tuesday":
//                System.out.println("It is Tuesday");
//                break;
//            case "Wednesday":
//                System.out.println("It is Wednesday");
//                break;
//            case "Thursday":
//                System.out.println("It is Thursday");
//                break;
//            case "Friday":
//                System.out.println("It is Friday");
//                break;
//            case "Saturday":
//                System.out.println("It is Saturday");
//                break;
//            default:
//                System.out.println("That is not a day!");
//        }
//
//
// ------------------ Logical operators -----------------------//
//  &&
//        int temp = 31;
//        if (temp > 30) {
//            System.out.println("It is hot outside!");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("It is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }
//
//  ||
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game! Press q or Q to quit");
//        String response = scanner.next();
//        if (response.equals("q") || response.equals("Q")) {
//            System.out.println("You quit the game");
//        } else {
//            System.out.println("You are still playing the game \"pew pew\"");
//        }
//
//  !
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game! Press q or Q to quit");
//        String response = scanner.next();
//        if (!response.equals("q") && !response.equals("Q")) {
//            System.out.println("You are still playing the game \"pew pew\"");
//        } else {
//            System.out.println("You quit the game");
//        }
//
//
// ------------------ While loop -----------------------//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//        while (name.isBlank()) {
//            System.out.println("Enter your name");
//            name = scanner.nextLine();
//        }
//
//        do {
//            System.out.println("Enter your name");
//            name = scanner.nextLine();
//        }
//        while (name.isBlank());
//
//        System.out.println("Hello " + name);
//
//
// ------------------ For loop -----------------------//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Happy new year!");
//
//
// ------------------ Nested loop -----------------------//
//
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.println();
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol);
//            }
//        }
//
//
// ------------------ Arrays -----------------------//
        // ex:1
//        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
//        cars[0] = "Mustang";
//
//        System.out.println(cars[3]);

        // ex:2
//        String[] cars = new String[3];
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//
// ------------------ 2D Arrays -----------------------//
        // ex:1
//        String[][] cars = {
//                {"Camaro", "Corvette", "Silverado"},
//                {"Mustang", "Ranger", "150"},
//                {"Ferrari", "Lambo", "Tesla"}
//        };

        // ex:2
//        String[][] cars = new String[3][3];
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "F-150";
//        cars[2][0] = "Ferrari";
//        cars[2][1] = "Lambo";
//        cars[2][2] = "Tesla";

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//        }
//
//
// ------------------ String method -----------------------//
//        String name = "  Petch  ";
//        boolean result = name.equalsIgnoreCase("Petch");
//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("t");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
//        String result = name.replace("P", "s");
//
//        System.out.println(result);
//
//
// ------------------ Wrapper Classes -----------------------//
        // wrapper class =  provides a way to use primitive data types as reference data types
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char   Character
        // int   Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

//        Boolean a = true;
//        Character b = '@';
//        Integer c = 123;
//        Double d = 3.14;
//
// ------------------ ArrayList -----------------------//
//        ArrayList<String> foods = new ArrayList<String>();
//
//        foods.add("Pizza");
//        foods.add("Hamburger");
//        foods.add("Hotdog");
//
//        foods.set(0, "Sushi");
//        foods.remove(2);
//        foods.clear();
//
//        for (int i = 0; i < foods.size(); i++) {
//            System.out.println(foods.get(i));
//        }
//
// ------------------ 2D ArrayList -----------------------//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
//
//        ArrayList<String> bakeryList = new ArrayList<String>();
//        bakeryList.add("Pasta");
//        bakeryList.add("Garlic Bread");
//        bakeryList.add("Donuts");
//
//        ArrayList<String> produceList = new ArrayList<String>();
//        produceList.add("Tomatoes");
//        produceList.add("Zucchini");
//        produceList.add("Peppers");
//
//        ArrayList<String> drinksList = new ArrayList<String>();
//        drinksList.add("Soda");
//        drinksList.add("Coffee");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinksList);
//
//        System.out.println(groceryList.get(2).get(1));
//
//
// ------------------ For-each loop -----------------------//

//        String[] animals = {"cat", "dog", "rat", "bird"};
//        ArrayList<String> animals = new ArrayList<String>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");
//
//        for (String i : animals) {
//            System.out.println(i);
//        }
//
// ------------------ Method -----------------------//
//        String name = "Petch";
//        int age = 26;
//        hello(name, age);
//
//        int x = 3;
//        int y = 4;
//
//        System.out.println(add(x, y));
//
//
// ------------------ Overload method -----------------------//


    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }

}