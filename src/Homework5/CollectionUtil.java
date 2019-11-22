package Homework5;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        arrayListCreation();
        linkedListCareation();
        queueCreation();
    }

    public static void arrayListCreation() {
        ArrayList<String> alist = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str;
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter the next element:");
            str = in.nextLine();
            if (str.isEmpty()) {
                i = -1;
            } else {
                alist.add(str);
            }
        }

        System.out.println("Array list contains:");
        for (String s : alist) {
            System.out.println(s);
        }
    }

    public static void linkedListCareation() {
        LinkedList<Integer> llist = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int num;
        String str;
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter the next element:");
            str = in.nextLine();
            if (str.isEmpty()) {
                i = -1;
            } else {
                num = Integer.parseInt(str);
                llist.add(num);
            }
        }

        System.out.println("Linked list contains:");
        for (int s : llist) {
            System.out.println(s);
        }
    }

    public static void queueCreation() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        String str;
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter the next element:");
            str = in.nextLine();
            if (str.isEmpty()) {
                i = -1;
            } else {
                pq.add(str);
            }
        }

        System.out.println("Queue contains:");
        for (String s : pq) {
            System.out.println(s);
        }
    }
}
