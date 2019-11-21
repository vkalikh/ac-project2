package Homework5.Task1;

public class Main implements Callback {
    private int a = 0;

    @Override
    public void call() {
        a = a + 10;
        System.out.println("Last " + a);
    }
}
