package Homework2;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 9:");
        n = in.nextInt();
        while (n >= 10 || n <= 0) {
            System.out.println("Invalid number. \n Enter one more time:");
            n = in.nextInt();
        }

        switch (n){
            case 1:
                System.out.println("Monday" );
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Tuesday");
        }
    }
}
