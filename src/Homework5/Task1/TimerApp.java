package Homework5.Task1;

public class TimerApp {
    public static void main(String[] args) {
        Timer task = new Timer(new Handler());
        System.out.println("Start!");
        task.timer();
    }
}
