package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        int n = 0, i, x;
        boolean sorted = false;

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

        x = mas[0];
        while (!sorted){
            sorted = true;
            for (i = 1; i < n; i++){
                if (mas[i]<mas[i-1]){
                    x = mas[i-1];
                    mas[i-1] = mas[i];
                    mas[i] = x;
                    sorted = false;
                }
            }
        }
        for (i = 0; i < n; i++) {
           System.out.print(mas[i] + ", ");
        }
    }
}
