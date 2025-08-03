package org.example.session18.homework;

public class Student {
    /*Create a Student class with name, age, studentId, and email fields.
    Implement the equals() method to check all fields except the studentId.
    Implement the hashCode() method to use all fields except the student Id to calculate the hash code.
    Test that two instances with the same name, age, and email return true for equals() and have the same hash code.*/
    private String name;
    private int age;
    private String studentId;
    private String email;
    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                name.equals(student.name) &&
                email.equals(student.email);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + email.hashCode();
        return result;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, "S12345", "johndoe@idk.com");
        Student student2 = new Student("John Doe", 20, "S67890", "johndoe@idk.com");
        Student student3 = new Student("Jane Doe", 22, "S54321", "janedoe@idk.com");
        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 equals student3: " + student1.equals(student3));
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}
