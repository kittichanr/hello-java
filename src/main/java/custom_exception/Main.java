package custom_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
    }
}
