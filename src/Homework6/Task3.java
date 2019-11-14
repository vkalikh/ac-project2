package Homework6;

import java.nio.charset.Charset;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] array = new byte[7];
        new Random().nextBytes(array);

        List<String> sList = new ArrayList<>();
        List<String> lList = new LinkedList<>();
        String str;
        for (int i = 0; i < 1000000; i++) {
            str = new String(array, Charset.forName("UTF-8"));
            sList.add(str);
            lList.add(str);
        }

        int iterations;
        System.out.println("How many iterations do you want to do?");
        iterations = in.nextInt();
        String[] mas = new String[iterations];
        for (int i = 0; i < iterations; i++) {
            mas[i] = String.valueOf(i);
        }
        System.out.println();


        long time1, time2;
        int indicator = 0;
        System.out.println("Start adding to the first list");
        time1 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            if (sList.size() % 2 == 0) {
                sList.add((sList.size() / 2) + 1, mas[i]);
                /*                System.out.println("Add to the center");*/
            } else {
                if (indicator == 1 || indicator == 0) {
                    sList.add((sList.size() / 2) + 2, mas[i]);
                    /*                    System.out.println("Add to the right");*/
                    indicator = -1;
                } else {
                    sList.add(sList.size() / 2, mas[i]);
                    /*                    System.out.println("Add to the left");*/
                    indicator = 1;
                }
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time is " + (time2 - time1) + " mls");
        System.out.println();

        indicator = 0;
        System.out.println("Start adding to the second list");
        time1 = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            if (lList.size() % 2 == 0) {
                lList.add((lList.size() / 2) + 1, mas[i]);
                /*                System.out.println("Add to the center");*/
            } else {
                if (indicator == 1 || indicator == 0) {
                    lList.add((lList.size() / 2) + 2, mas[i]);
                    /*                    System.out.println("Add to the right");*/
                    indicator = -1;
                } else {
                    lList.add(lList.size() / 2, mas[i]);
                    /*                    System.out.println("Add to the left");*/
                    indicator = 1;
                }
            }
        }
        time2 = System.currentTimeMillis();
        System.out.println("Time is " + (time2 - time1) + " mls"); //https://habr.com/ru/post/233797/


    }
}
