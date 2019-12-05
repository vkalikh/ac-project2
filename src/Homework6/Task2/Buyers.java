package Homework6.Task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Buyers {
    private ArrayList<GoodsList> productList;

    public Buyers() {
        System.out.println("How many goods do you want to buy:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        GoodsList[] set = new GoodsList[num];
        ArrayList<GoodsList> intermediateGL = new ArrayList<>();
        String s;
        for (int i = 0; i < num; i++) {
            set[i] = new GoodsList();
            System.out.println("Enter Good, coast and count: ");
            in.nextLine();
            set[i].setGoodsName(in.nextLine());
            set[i].setCost(in.nextFloat());
            set[i].setCount(in.nextInt());
            intermediateGL.add(set[i]);
        }

        this.productList = intermediateGL;
    }

    public ArrayList<GoodsList> getProductList() {
        return productList;
    }

}

