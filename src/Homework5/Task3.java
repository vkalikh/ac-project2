package Homework5;


import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int i;
        Integer[] intMas = new Integer[]{1, 2, 3, 4, 5};
        String[] strMas = new String[]{"Summer", "Automn", "Winter", "Spring"};

        List<Integer> list1 = Arrays.asList(intMas);
        List<String> list2 = Arrays.asList(strMas);

        for (int s : list1) {
            System.out.print(s + ", ");
        }

        for (String s : list2) {
            System.out.print(s + ", ");
        }

    }
}