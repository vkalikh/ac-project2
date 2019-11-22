package Homework5.Task1;

public class Timer {
    Callback callback;

    public Timer(Callback callback) {
        this.callback = callback;
    }

    public void timer() {
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