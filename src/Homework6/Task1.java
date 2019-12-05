package Homework6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> plant = new LinkedHashMap<>();
        plant.put("Watermelon", "berry");
        plant.put("Strawberry", "nut");
        plant.put("Apple", "fruit");
        plant.put("Tomato", "berry");
        plant.put("Peanut", "fabaceae");

        Scanner in = new Scanner(System.in);
        System.out.println("What element do you want to know about?\n- Watermelon;\n- Strawberry;\n- Apple;\n- Tomato;\n- Peanut;");
        String str = in.nextLine();
        String str2 = plant.get(str);
        if (str2 == null){
            System.out.println("Not found");
        }else{
            System.out.printf(str + " is " + str2);
        }
    }
}
