package Homework6;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        Set<Integer> keys = new HashSet<>();
        List<String> values = new ArrayList<>();
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("How much elements do you want to add to the map:");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter key");
            int key = in.nextInt();
            while (map.containsKey(key) == true){
                System.out.println("Key is already used. Enter unique one.");
                key = in.nextInt();
            }
            System.out.println("Enter value");
            in.nextLine();
            str = in.nextLine();
            map.put(key, str);
        }

        for (Map.Entry<Integer, String> s : map.entrySet()) {
            keys.add(s.getKey());
            values.add(s.getValue());
        }

        System.out.println("\nCollection of keys");
        for (Integer s: keys) {
            System.out.println(s);
        }

        System.out.println("\nCollection of values");
        for (String s: values) {
            System.out.println(s);
        }
    }
}
