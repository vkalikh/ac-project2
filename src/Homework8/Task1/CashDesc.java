package Homework8.Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class CashDesc extends Thread {
    private Deque<Buyers> deskQueue;


    public CashDesc(String name, Deque<Buyers> deskQueue) {
        super(name);
        this.deskQueue = deskQueue;
    }

    public void run() {
        while (!deskQueue.isEmpty() && deskQueue.size() != 0) {
            System.out.println("Start serving customers on " + Thread.currentThread().getName());
                if (!deskQueue.isEmpty() && deskQueue.size() != 0) {
                payOff(countingTotalCost(processing().getProductList()));
            }
                else{
                    System.out.println("Nobody in queue for " + Thread.currentThread().getName());
                }        }
    }

    synchronized Buyers processing (){
        Buyers b = deskQueue.getFirst();
        deskQueue.poll();
        return b;
    }

    private static float countingTotalCost(ArrayList<GoodsList> a) {
        float total = 0;
        for (GoodsList s : a) {
            total = total + s.getCost() * s.getCount();
        }
        return total;
    }

    private static void payOff(float a) {
        Random r = new Random();
        float pay = (float) Math.floor(a) + r.nextInt(5);
        System.out.println(Thread.currentThread().getName() + ": For pay - " + a);
        System.out.println(Thread.currentThread().getName() + ": Your change - " +  new BigDecimal(pay - a).setScale(2, RoundingMode.UP));
        System.out.println("Thanks you from " + Thread.currentThread().getName());
        System.out.println();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
