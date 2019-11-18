package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        int n = 0, i, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a even number of items:");
        n = in.nextInt();

        while (n <= 0 || n % 2 != 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        int[] mas = new int[n];
        int[] mas2 = new int[n];
        Random rand = new Random();

        for (i = 0; i < n; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        for (i = 0; i < n / 2; i++) {
            mas2[i] = mas[i + n / 2];
            sum = mas[i] + mas2[i];
            System.out.print(sum + ", ");
        }

    }
}
