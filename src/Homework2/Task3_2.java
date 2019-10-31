package Homework2;

import java.util.Scanner;

public class Task3_2 {

    public static void main(String[] args) {
        int n = 0, i = 0, j, x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number's count:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }
        x = n*2;
        int[] mas = new int[x+1];

            for(j=n; j>0; j--, i++, x--){
                mas[i] = j;
                mas[x] = j;
            }
            mas[n] = 0;

            for(i=0; i<=(n*2); i++)
                System.out.print(mas[i] + ", ");
    }



}
