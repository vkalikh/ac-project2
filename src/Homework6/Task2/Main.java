package Homework6.Task2;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<ArrayList> shopQueue = new ArrayDeque<>();
        System.out.println("How many people in the queue:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        float cost = 0;
        for (int i = 0; i < num; i++) {
            shopQueue.addLast(addGoods());
        }
        System.out.println("Start serving customers");
        for (int i = 0; i < num; i++) {
            cost = countingTotalCost(shopQueue.getFirst());
            payOff(cost);
            shopQueue.poll();
        }
    }

    private static ArrayList<GoodsList> addGoods() {
        System.out.println("How many goods do you want to buy:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        GoodsList[] set = new GoodsList[num];

        ArrayList<GoodsList> list = new ArrayList<>();
        String s;

        for (int i = 0; i < num; i++) {
            set[i] = new GoodsList();
            System.out.println("Enter Good, coast and count: ");
            in.nextLine();
            set[i].setGoodsName(in.nextLine());
            set[i].setCost(in.nextFloat());
            set[i].setCount(in.nextInt());
            list.add(set[i]);
        }
        return list;
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
