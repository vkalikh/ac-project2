package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        int n=0, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number's count:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        int[] mas = new int[n];
        Random rand = new Random();

        for (i=0; i<n; i++)
        {
            mas[i] = rand.nextInt(100);
            System.out.print(mas[i] + ", ");
        }
    }
}
