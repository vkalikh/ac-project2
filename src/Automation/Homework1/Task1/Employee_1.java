package Automation.Homework1.Task1;

public class Employee_1 {
    String firstName, lastName, middleName, position, department, experience;

    public Employee_1(String firstName, String lastName, String middleName, String position, String department, String experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee_1{" +
                "Name = " + lastName + ' ' + firstName + ' ' + middleName +
                ", position=" + position +
                ", department=" + department +
                ", experience=" + experience +
                '}';
    }
}
