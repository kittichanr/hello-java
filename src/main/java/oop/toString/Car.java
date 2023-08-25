package oop.toString;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2023;

    @Override
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
