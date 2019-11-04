package Homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str1;
        int lenth, n1 = 0, n2 = 0, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a math expression:");
        str1 = in.nextLine();
        lenth = str1.length();

        char[] strArray = str1.toCharArray();
        for (i = 0; i < lenth; i++) {
            if (strArray[i] == '(') {
                n1++;
            } else if (strArray[i] == ')') {
                n2++;
            }
        }
        if (n1 == n2)
            System.out.println("Expression is valid");
        else if (n1 > n2)
            System.out.println("Invalid. You forgot at least one ')'");
        else
            System.out.println("Invalid. You forgot at least one '('");

    }
}
