package Homework3;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int summing(Calculator clc) {
        return clc.getA() + clc.getB();
    }

    public static int subtraction(Calculator clc) {
        return clc.getA() - clc.getB();
    }

    public static int multiplication(Calculator clc) {
        return clc.getA() * clc.getB();
    }

    public static void main(String[] args) {
        int a, b, operator;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = in.nextInt();
        System.out.println("Enter the second number:");
        b = in.nextInt();
        Calculator clc = new Calculator(a, b);

        System.out.println("Enter opeation (1 in case of +, 2 in case of - or 3 in case of *):");
        operator = in.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Result: " + summing(clc));
                break;
            case 2:
                System.out.println("Result: " + subtraction(clc));
                break;
            case 3:
                System.out.println("Result: " + multiplication(clc));
                break;
        }

    }


}
