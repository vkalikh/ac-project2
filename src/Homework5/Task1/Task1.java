package Homework5.Task1;

public class Task1 {
    private static int a;

    public static void main(String[] args) {
        a = 0;
        System.out.println("Start!");
        timer();
    }

    private static void timer() {
        try {
            while (true) {
                Thread.sleep(10 * 1000);
                pritTime();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void pritTime() {
        a = a + 10;
        System.out.println("Last " + a);
        timer();
    }
}
