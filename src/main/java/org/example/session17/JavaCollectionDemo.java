package org.example.session17;

import java.util.*;

public class JavaCollectionDemo {
    public static void main(String[] args) {
       // listDemo();
       // setDemo();
        mapDemo();

    }

    public static void listDemo() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            numbers.add(i * 10); // Adding elements to the list
        }
        System.out.println(numbers);
        numbers.add(3,25); // Inserting an element at index 3
        System.out.println(numbers);
        numbers.set(3,26); // Replacing the element at index 3
        System.out.println(numbers);
        System.out.println(numbers.contains(26));
        System.out.println(numbers.contains(25));

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        numbers.get(2); // Accessing the element at index 2;
    }

    enum Day {Luni, Marti, Miercuri, Joi, Vineri, Sambata, Duminica}

    public static void setDemo() {
        // Set is a collection that does not allow duplicate elements
        // It is unordered and does not maintain the order of elements
        // Example: HashSet, LinkedHashSet, TreeSet

        Set<String> students = new HashSet<>();
        students.add("Marcel");
        students.add("Marcela");
        students.add("Mihai");
        students.add("Marcel"); // Duplicate element, will not be added
        System.out.println(students);

        students.remove("Mihai"); // Removing an element
        System.out.println(students);
        System.out.println(students.contains("Mihai")); // Checking if an element exists

        EnumSet<Day> days = EnumSet.range(Day.Luni,Day.Vineri);
        System.out.println(days);
        days.add(Day.Vineri); // Adding an element
        System.out.println(days);
        days.add(Day.Duminica);
        System.out.println(days);
    }

    public static void mapDemo() {
        // Map is a collection that stores key-value pairs
        // Example: HashMap, LinkedHashMap, TreeMap

        Map<String, Integer> students = new HashMap<>();
        students.put("Marcel", 29); // Adding key-value pair
        students.put("Marcela", 30);
        students.put("Mihai", 82);
        System.out.println(students);
        students.put("Marcel", 31); // Updating value for existing key
        System.out.println(students);
        System.out.println(students.get("Marcel")); // Accessing value by key

        for (String name : students.keySet()){
            System.out.println("Student name: " + name + ", Age: " + students.get(name));
        }
        for (Map.Entry<String,Integer> entry : students.entrySet()) {
            System.out.println("Student name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
        students.remove("Mihai"); // Removing an entry by key
        System.out.println(students);
    }
}
