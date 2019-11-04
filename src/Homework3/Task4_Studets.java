package Homework3;

import Collection.Student;

import java.util.ArrayList;
import java.util.List;

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
        List<Task4_Studets> students = new ArrayList<>();
        int course = 2;

        Task4_Studets st1 = new Task4_Studets("Petr", "Ivanov", "01.01.1997", 2);
        Task4_Studets st2 = new Task4_Studets("Ivan", "Petrov", "02.02.1998", 2);
        Task4_Studets st3 = new Task4_Studets("Kate", "Petrova", "02.02.1999", 1);
        Task4_Studets st4 = new Task4_Studets("Ira", "Fox", "02.02.1995", 4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        Task4_Studets.printStudents(students, course);
    }

    public static void printStudents(List<Task4_Studets> students, int course) {
        for (Task4_Studets s : students) {
            if (s.getCourse() == 2) {
                System.out.println(s);
            }
        }

    }
}
