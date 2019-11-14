package Homework5;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        int[] intMas = new int[]{1, 2, 3, 4, 5};
        String[] strMas = new String[]{"Summer", "Automn", "Winter", "Spring"};

        for (i = 0; i < intMas.length; i++) {
            list1.add(intMas[i]);
        }

        for (int s : list1) {
            System.out.print(s + ", ");
        }

        System.out.println();
        for (i = 0; i < strMas.length; i++) {
            list2.add(strMas[i]);
        }

        for (String s : list2) {
            System.out.print(s + ", ");
        }

    }
}
