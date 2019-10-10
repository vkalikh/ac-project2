import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        String s = "test";
        System.out.println(s);
        int[] array = new int[]{1, 2, 3, 4, 5};
        int avg;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        avg = sum / array.length;
        System.out.println(avg);
    }
}
