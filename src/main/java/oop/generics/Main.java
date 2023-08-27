package oop.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // generics =     enable types (classes and interface) to be parameters when defining:
        //                classes,interfaces and methods
        //                a benefit is to eliminate the need to create multiple versions
        //                of methods or classes for various data types.
        //                Use 1 version for all reference data types.

//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//        String[] stringArray = {"B", "Y", "E"};
//
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);
//
//        System.out.println();
//
//        System.out.println(getFirst(intArray));
//        System.out.println(getFirst(doubleArray));
//        System.out.println(getFirst(charArray));
//        System.out.println(getFirst(stringArray));

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);
//        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
//        MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());


        //bounded types = 	you can create the objects of a generic class to have data
        //					of specific derived types ex.Number
    }

    public static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
}
