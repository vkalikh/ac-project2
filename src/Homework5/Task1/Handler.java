package Homework5.Task1;

public class Handler implements Callback {
    private int a = 0;

    @Override
    public void call() {
        a = a + 10;
        System.out.println("Last " + a);
    }
}
