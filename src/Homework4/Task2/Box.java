package Homework4.Task2;

import java.util.Scanner;

public class Box extends Shape {
    private static double boxVolume;


    public static void main(String[] args) {
        boolean ident = true;
        Box box = new Box();
        boxVolume = box.getVolume();
        Pyramid p = new Pyramid(3, 1);
        Ball b = new Ball(1);
        Cylindr c = new Cylindr(2, 1);
        Scanner in = new Scanner(System.in);

        while (ident) {
            System.out.println("What you want to put in the box:\n- Ball - 1,\n- Cylindr - 2,\n- Piramid - 3");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    if (!box.add(b.getVolume())) {
                        ident = false;
                    }
                    break;
                case 2:
                    if (!box.add(c.getVolume())) {
                        ident = false;
                    }
                    break;
                case 3:
                    if (!box.add(p.getVolume())) {
                        ident = false;
                    }
                    break;
                default:
                    System.out.println("your entered invalid data!!!\n");
                    break;
            }
        }
    }

    private boolean add(double v) {
        double check = boxVolume - v;
        if (check >= 0) {
            boxVolume = boxVolume - v;
            System.out.println("Item in the box\n");
            return true;
        } else {
            System.out.println("There is no space for it\n");
            return false;
        }
    }


    @Override
    public double getVolume() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a one side:");
        double a = in.nextDouble();
        System.out.println("Enter a another side:");
        double b = in.nextDouble();
        System.out.println("Enter a height:");
        double h = in.nextDouble();
        return a * b * h;
    }
}
