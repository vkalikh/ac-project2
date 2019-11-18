package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 7)
            System.out.println("Number is 7");
        else
            System.out.println("Number is not equal 7");
    }
}
