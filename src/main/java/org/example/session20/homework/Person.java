package org.example.session20.homework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String alice, String johnson, int i) {
        this.firstName = alice;
        this.lastName = johnson;
        this.age = i;
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
}
