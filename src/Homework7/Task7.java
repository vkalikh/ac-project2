package Homework7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the date in format: YYYY/MM/DD HH:MM:SS");
        String date = in.nextLine();
        if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/(1[0-2]|0[1-9])/(0[1-9]|[1-2][0-9]|3[0-1])\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) {
            if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/(04|06|09|11)/31\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) //verification for 31 day in some month
            {
                System.out.println("Invalid date");
            } else if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/02/(30|31)\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) { //February
                System.out.println("Invalid date");
            } else {
                System.out.println("OK");
            }
        } else {
            System.out.println("Invalid date");
        }
    }
}
