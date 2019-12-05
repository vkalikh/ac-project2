package Homework6.Task2;

import java.util.*;

public class CashDesc {
    private Deque<Buyers> shopQueue;

    public CashDesc(int num) {
        Deque<Buyers> intermediateSQ = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            intermediateSQ.addLast(new Buyers());
        }
        this.shopQueue = intermediateSQ;
    }

    public void serving(int num) {
        System.out.println("Start serving customers");
        for (int i = 0; i < num; i++) {
            payOff(countingTotalCost(shopQueue.getFirst().getProductList()));
            shopQueue.poll();
        }
    }

    private static float countingTotalCost(ArrayList<GoodsList> a) {
        float total = 0;
        int i = 0;
        for (GoodsList s : a) {
            total = total + s.getCost() * s.getCount();
        }
        return total;
    }

    private static void payOff(float a) {
        System.out.println("In total you should pay " + a);
        System.out.println("Please, pay");
        Scanner in = new Scanner(System.in);
        float pay = in.nextFloat();
        while (pay <= a) {
            System.out.println("Not enough money");
            pay = in.nextFloat();
        }
        System.out.println("Your change:" + (pay - a));
        System.out.println("Thanks you");
    }
}
