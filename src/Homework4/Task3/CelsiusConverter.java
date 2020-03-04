package Homework4.Task3;

import java.util.Scanner;

public class CelsiusConverter {
    private double с;

    public CelsiusConverter() {
    }

    public double getС() {
        return с;
    }

    public void setС(double с) {
        this.с = с;
    }

    public static void main(String[] args) {
        CelsiusConverter num = new CelsiusConverter();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a celsius degrees:");
        num.setС(in.nextDouble());

        FahrenheitConverter f = new FahrenheitConverter();
        System.out.println("Result in fahrenheit: " + f.convert(num.getС()));

        KelvinConverter k = new KelvinConverter();
        System.out.println("Result in kelvin: " + k.convert(num.getС()));
    }

}
