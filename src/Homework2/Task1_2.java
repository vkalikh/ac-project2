package Homework2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1_2 {
    public static void main(String[] args) {
        int a = 0, b = 0, r = 0;
        double c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first side of rectangle:");
        a = in.nextInt();
        System.out.println("Enter the second side of rectangle:");
        b = in.nextInt();
        System.out.println("Enter a circle radius:");
        r = in.nextInt();
        c = sqrt(a ^ 2 + b ^ 2);
        if (c <= r * 2)
            System.out.println("Circle could overlap rectangle fully");
        else
            System.out.println("Circle couldn't overlap rectangle fully");
    }
}
