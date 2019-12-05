package Homework8;


import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] mas = new double[2];
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the value:");
            mas[i] = in.nextDouble();
        }

        sum = DoubleStream.of(mas).sum();
        System.out.println(sum);
        if (sum - (int) sum == 0) {
            System.out.println(String.valueOf((int) sum).replaceAll("\\d", "0"));
        } else {
            System.out.println(String.valueOf(sum).replaceAll("\\d", "0"));
        }
    }
}
