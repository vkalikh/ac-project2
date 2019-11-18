package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_7 {

    public static void main(String[] args) {
        int n = 0, i, j, len = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        int[][] mas = new int[n][];
        Random rand = new Random();

        for (i = 0; i < n; i++) {
            len = rand.nextInt(8);
            mas[i] = new int[len];
            for (j = 0; j < len; j++) {
                mas[i][j] = rand.nextInt(15);
                System.out.print(mas[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
