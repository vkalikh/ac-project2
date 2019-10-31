package Homework2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        int n=0, f=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number bigger than 0:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        if (n == 1)
            System.out.println("Factorial = 1" );

        f=n;
        while (n != 1){
            n--;
            f = f * n;
        }
        System.out.println("Factorial = " + f);
    }
}
