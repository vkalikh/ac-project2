package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3_8 {

    public static void main(String[] args) {
        int i, j;
        int[][] mas = new int[5][];
        for (i = 0; i < 5; i++) {
            mas[i] = new int[i + 1];
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
