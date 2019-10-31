package jenerics.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> list = new ArrayList<>();
        Canvas canvas = new Canvas();
        canvas.drawAll(list);
    }
}
