package Homework7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String fileName;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a file name:");
        fileName = in.nextLine();
        try (FileReader fr = new FileReader(fileName)) {
            int i = 0, result = 0;
            while ((i = fr.read()) != -1) {
                if (i > result) {
                    result = i;
                }
                //System.out.print(i +", ");
            }
            System.out.print("The biggest byte is equal to '" + (char) result + "' - " + result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
