package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, i, j, z, x, times = 0;
        boolean sorted = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of items 1:");
        n1 = in.nextInt();
        System.out.println("Enter a number of items 2:");
        n2 = in.nextInt();

        int[] mas1 = new int[n1];
        int[] mas2 = new int[n2];

        System.out.println("Enter already sorted massiv:");
        for (i = 0; i < n1; i++) {
            mas1[i] = in.nextInt();
        }

        System.out.println("Enter already sorted massiv:");
        for (i = 0; i < n2; i++) {
            mas2[i] = in.nextInt();
        }

        int n3 = n1 + n2;
        int[] mas3 = new int[n3];
        for (i = 0, j = 0, z = 0; z < n3; z++, times++) {
            if (i == -1) {
                if (j != -1) {
                    mas3[z] = mas2[j];
                    if (j == n2 - 1) {
                        j = -1;
                    } else {
                        j++;
                    }
                }
            } else if (j == -1) {
                mas3[z] = mas1[i];
                if (i == n1 - 1) {
                    i = -1;
                } else {
                    i++;
                }
            } else if (mas1[i] < mas2[j]) {
                mas3[z] = mas1[i];
                if (i == n1 - 1) {
                    i = -1;
                } else {
                    i++;
                }
            } else {
                mas3[z] = mas2[j];
                if (j == n2 - 1) {
                    j = -1;
                } else {
                    j++;
                }
            }
        }


        for (i = 0; i < n3; i++) {
            System.out.print(mas3[i] + ", ");
        }
        System.out.println("Number of steps: " + times);
    }
}
