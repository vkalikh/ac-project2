package Homework4.Task2;

public class Cylindr extends SolidOfRevolution {
    private double height;

    public Cylindr(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * height * Math.pow(getRadius(), 2);
    }
}
