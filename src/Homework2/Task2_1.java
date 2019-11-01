package Homework2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        int n=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number bigger than 3:");
        n = in.nextInt();
        while (n <= 3) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        while (n > 3) {
            if (n%2 == 0){
            System.out.print(n + ", ");}
            n = n-1;
        }


    }
}
