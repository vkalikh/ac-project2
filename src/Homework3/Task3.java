package Homework3;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "1.0.0";
        String str2 = "1.1.1";
        int compare = str1.compareTo(str2);

        if (compare > 0)
            System.out.println(str2 + " is out of date");
        else if (compare < 0)
            System.out.println(str1 + " is out of date");
    }
}
