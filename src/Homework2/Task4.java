package Homework2;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        int n = 0, check = 2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        n = in.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }
        checkForNatural(n, check);
    }

    public static void checkForNatural (int n, int check){
        if (n>1){
            if (n%check != 0){
                check++;
                checkForNatural(n, check);
            }
            else if (n/check == 1){
                System.out.println("Is number " + n + " simple - YES");}
            else
                System.out.println("Is number " + n + " simple - NO");
        }
        else
            System.out.println("Is number " + n + " simple - YES");
    }
}
