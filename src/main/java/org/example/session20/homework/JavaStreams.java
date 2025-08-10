package org.example.session20.homework;

import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        //Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this. (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);
        
        //Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String longestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("No strings available");
        System.out.println("Longest string: " + longestString);
        
        //Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
        List<Integer> primeNumbers = java.util.stream.IntStream.rangeClosed(1, 100)
                .filter(JavaStreams::isPrime)
                .boxed()
                .toList();
        System.out.println("Prime numbers from 1 to 100: " + primeNumbers);

        
        //Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
        List<String> stringList = Arrays.asList("one", "two", "three", "four");
        String concatenatedString = stringList.stream()
                .collect(java.util.stream.Collectors.joining(", "));
        System.out.println("Concatenated string: " + concatenatedString);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    //Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
    //class Person {
    //    String firstName;
    //    String lastName;
    //    int age;
    //}
    List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20),
            new Person("Bob", "Smith", 17));
    List<Person> adults = people.stream()
            .filter(person -> person.getAge() > 18)
            .toList();
}
