package Homework5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4<T> {
    ArrayList<T> list;

    public Task4(ArrayList<T> list) {
        this.list = list;
    }

    private void identificator (ArrayList<T> a, int i){
        System.out.println("The item with number " + (i+1) + " is " + a.get(i));
    }

    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.1);
        list1.add(2.2);
        list1.add(3.3);
        list1.add(4.4);
        list1.add(5.5);
        Task4<Double> list11 = new Task4<>(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Summer1");
        list2.add("Summer2");
        list2.add("Summer3");
        Task4<String> list22 = new Task4<>(list2);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 or 2:");
        int num = in.nextInt();
        switch (num){
            case 1:
                System.out.println("Enter any number from 1 to "+list1.size());
                int index1 = in.nextInt();
                list11.identificator (list1, index1-1);
                break;
            case 2:
                System.out.println("Enter any number from 1 to "+list2.size());
                int index2 = in.nextInt();
                list22.identificator (list2, index2-1);
                break;
        }




    }

}
