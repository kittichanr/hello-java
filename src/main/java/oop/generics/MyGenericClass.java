package oop.generics;

public class MyGenericClass<T extends Number, E extends Number> {
    T x;
    E y;

    MyGenericClass(T x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getValue() {
        return y;
    }
}
