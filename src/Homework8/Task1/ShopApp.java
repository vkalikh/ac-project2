package Homework8.Task1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("How many people in the queue:");
        Scanner in = new Scanner(System.in);
        int numberOfBuyers = in.nextInt();
        Deque<Buyers> shopQueue = new ArrayDeque<>();
        for (int i = 0; i < numberOfBuyers; i++) {
            shopQueue.addLast(new Buyers());
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
                new CashDesc("Thread" + i, shopQueue).start();
        }
    }

}
