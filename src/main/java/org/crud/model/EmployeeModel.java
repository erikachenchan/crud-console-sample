package org.crud.model;

public class EmployeeModel {

    private String firstName;
    private String lastName;
    private int age;

    public EmployeeModel() {

    }

    public EmployeeModel(String firstName, String lastName, int userAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = userAge;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
