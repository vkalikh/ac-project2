package Homework6.Task2;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("How many people in the queue:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        CashDesc desc1 = new CashDesc(num);
        desc1.serving(num);
    }


}
