package Homework8.Task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Buyers {
    private ArrayList<GoodsList> productList;

    public Buyers() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int num = random.nextInt(10);
        GoodsList[] set = new GoodsList[num];
        ArrayList<GoodsList> intermediateGL = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            set[i] = new GoodsList();
            set[i].setGoodsName(String.valueOf(random.nextLong()));
            set[i].setCost(random.nextFloat());
            set[i].setCount(random.nextInt(5));
            intermediateGL.add(set[i]);
        }
        this.productList = intermediateGL;
    }

    public ArrayList<GoodsList> getProductList() {
        return productList;
    }

}

