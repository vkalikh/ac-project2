package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4_Studets {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Task4_Studets(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public Task4_Studets() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Task4_Studets> students = new ArrayList<>();
        int course = 2, i;

        System.out.println("How many students do you want to enter:");
        int num = in.nextInt();
        Task4_Studets[] mas = new Task4_Studets[num];

        for (i = 0; i < num; i++) {
            mas[i] = new Task4_Studets();
            System.out.println("Enter info for student (Name, Surname, Date of Birthday, Cource): ");
            in.nextLine();
            mas[i].setName(in.nextLine());
            mas[i].setSurname(in.nextLine());
            mas[i].setDateOfBirthday(in.nextLine());
            mas[i].setCourse(in.nextInt());
            students.add(mas[i]);
        }

        Task4_Studets.printStudents(students, course);
    }

    public static void printStudents(List<Task4_Studets> students, int course) {
        for (Task4_Studets s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.toString());
            }
        }

    }

    @Override
    public String toString() {
        return "Name: '" + name +
                ", Surname: " + surname +
                ", Date Of Birthday: " + dateOfBirthday +
                ", Course: " + course;
    }
}
