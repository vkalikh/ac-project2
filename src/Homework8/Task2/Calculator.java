package Homework8.Task2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, operator;
        Scanner in = new Scanner(System.in);
        Method op1 = (x, y) -> x + y;
        Method op2 = (x, y) -> x - y;
        Method op3 = (x, y) -> x * y;

        System.out.println("Enter the first number:");
        a = in.nextInt();
        System.out.println("Enter the second number:");
        b = in.nextInt();

        System.out.println("Enter opeation (1 in case of +, 2 in case of - or 3 in case of *):");
        operator = in.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Result: " + op1.operations(a, b));
                break;
            case 2:
                System.out.println("Result: " + op2.operations(a, b));
                break;
            case 3:
                System.out.println("Result: " + op3.operations(a, b));
                break;
        }
    }

}
