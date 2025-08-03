package org.example.session18.homework;

public class Person {
    /*Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age fields.
    Implement the hashCode() method to use the name and age fields to calculate the hash code.
    Test that two instances with the same name and age return true for equals() and have the same hash code.*/
    private String name;
    private int age;
    private String email;
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "alice@idk.com");
        Person person2 = new Person("Alice", 30, "alice@idk.com");
        Person person3 = new Person("Bob", 25, "bob@idk.com");
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());
    }

}
