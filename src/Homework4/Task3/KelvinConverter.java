package Homework4.Task3;

public class KelvinConverter implements Converter {

    public KelvinConverter() {
    }

    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}

