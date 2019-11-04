package Homework2;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        n = in.nextInt();
        if (n % 2 == 0)
            if (n != 0)
                System.out.println("Even number");
            else
                System.out.println("Number is zero");
        else
            System.out.println("Odd number");
    }
}
