package Homework2;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Random;
import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        int n = 0, i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of items:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        int[][] mas = new int[n][n];
        Random rand = new Random();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                mas[i][j] = rand.nextInt(30);
                System.out.print(mas[i][j] + ", ");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                if (mas[i][j]%2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }


}
}
