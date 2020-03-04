package Homework8.Task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine();

        String[] mas = str.split(" ");
        System.out.println();

        Arrays.stream(mas)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((x, y) -> System.out.println(x + " repeats " + y + " times"));
    }
}
