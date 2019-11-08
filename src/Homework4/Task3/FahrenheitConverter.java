package Homework4.Task3;

public class FahrenheitConverter implements Converter {

    public FahrenheitConverter() {
    }

    @Override
    public double convert(double value) {
        return (value * 1.8 + 32);
    }
}
