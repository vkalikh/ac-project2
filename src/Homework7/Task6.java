package Homework7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the IP");
        String str = in.nextLine();
        if (Pattern.matches("^(([01]?[0-9][0-9]?|25[0-5]|2[0-4][0-9])\\.){3}([01]?[0-9][0-9]?|25[0-5]|2[0-4][0-9])$", str))
            System.out.println("This is the IP");
        else System.out.println("Invalid input");
    }
}
