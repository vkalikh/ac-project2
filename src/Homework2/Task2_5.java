package Homework2;

public class Task2_5 {
    public static void main(String[] args) {
        int i, j;
        char ch = 'A';
        char[] alphabet = new char[26];
        for (i = 0; i < 26; i++, ch++) {
            alphabet[i] = ch;
            //System.out.print(alphabet[i] + ", ");
        }

        for (i = 0; i < 26; i++) {
            for (j = 0; j < 4; j++) {
                if (i < 26) {
                    System.out.print(alphabet[i] + ", ");
                }
                i++;
            }
            System.out.println();
        }
    }

}
