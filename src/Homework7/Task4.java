package Homework7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a file name:");
        String fileName = in.nextLine();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int num = fis.available();
            int spaces = 0;
            char[] mas = new char[num];
            for (int i = 0; i < num; i++) {
                mas[i] = (char) fis.read();
                if (mas[i] == ' ' || mas[i] == '\n') {
                    spaces++;
                }
            }

            int j = 0, k = 0, n = 0;
            String[] strs = new String[(spaces + 1)];
            for (int i = 0; i < num; i++) {
                if (mas[i] != ' ' && mas[i] != '\n') {
                    n++;
                } else {
                    strs[k] = valueOf(mas, j, n);
                    System.out.println(strs[k]);
                    j = i + 1;
                    k++;
                    n = 0;
                }
            }
            strs[k] = valueOf(mas, j, n);
            System.out.println(strs[k]);


            for (int i = spaces; i >= 0; i--) {
                System.out.print(strs[i] + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
