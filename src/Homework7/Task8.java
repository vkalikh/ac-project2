package Homework7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter URL (enter space before submitting)");
        String url = in.nextLine();
        if (Pattern.matches("^(http|https)://(www.)?([a-z]{3,}.)?[a-z]{3,}.[a-z]{2,}/? $", url)) {
            System.out.println("Valid url");
        } else {
            System.out.println("Invalid url");
        }
    }
}
