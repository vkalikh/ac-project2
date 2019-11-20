package Homework7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a file name:");
        String str = in.nextLine();
        StringBuffer sb = new StringBuffer(str);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Task3.txt"))) {
            for (int i = sb.length(); i > 0; i--) {
                bw.write(sb.charAt(i - 1));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
