package org.example.session19.homework;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaHomework {
    //Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }

    //Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
    public static void sortStringsAlphabetically(List<String> strings) {
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted strings: " + sortedStrings);
    }

    //Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
    public static void sumOfIntegers(List<Integer> integers) {
        int sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of integers: " + sum);
    }

    //You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.
    public static void sortWords(List<String> words) {
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords);

        List<String> reverseSortedWords = words.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("Reverse sorted words: " + reverseSortedWords);
    }

    //Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
    @FunctionalInterface
    interface MaxValueFinder {
        Integer findMax(List<Integer> integers);
    }

    public static void findMaxValue(List<Integer> integers) {
        MaxValueFinder maxValueFinder = (list) -> {
            if (list.isEmpty()) {
                return null; // Handle empty list case
            }
            return list.stream().max(Integer::compareTo).orElse(null);
        };
        Integer max = maxValueFinder.findMax(integers);
        System.out.println("Maximum value: " + max);
    }
}

