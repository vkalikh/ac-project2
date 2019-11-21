package Homework5.Task1;

public class Task1 {

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Start!");
        timer(obj);
    }

    private static void timer(Callback callback) {
        try {
            while (true) {
                Thread.sleep(10 * 1000);
                callback.call();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
//Не увидела в этой задаче реализации механизма обратного вызова.