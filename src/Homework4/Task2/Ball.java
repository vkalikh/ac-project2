package Homework4.Task2;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (4 * Math.pow(getRadius(), 2) * Math.PI) / 3;
    }
}
