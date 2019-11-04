package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_4 {

    public static void main(String[] args) {
        int n = 0, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of items:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        int[] mas = new int[n];
        Random rand = new Random();

        for (i = 0; i < n; i++) {
            mas[i] = rand.nextInt(30);
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        int min = mas[0], max = mas[0], sum = mas[0];
        for (i = 1; i < n; i++) {
            sum = sum + mas[i];
            if (min > mas[i])
                min = mas[i];
            else if (max < mas[i])
                max = mas[i];
        }
        System.out.println("Maximun = " + max + "\nMinimum = " + min + "\nAvarage = " + (float) sum / n);
    }
}
