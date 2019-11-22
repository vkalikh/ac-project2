package Homework5.Task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        getLetterPosition();
    }

    public static void getLetterPosition() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any letter:");
        String n = in.next();
        for (Alp s : Alp.values()) {
            if (n.equalsIgnoreCase(s.toString())) {
                System.out.println("Order number is " + (s.ordinal() + 1));
            }
        }
    }
}
