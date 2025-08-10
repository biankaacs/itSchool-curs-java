package org.example.session19.homework;

import org.example.session18.homework.Objects;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceExemples {
    public static void main(String[] args) {
        //Create a functional interface with a method that takes two strings as input and returns an integer. Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).
        @FunctionalInterface
        interface StringLengthComparator {
            int compare(String s1, String s2);
        }
        StringLengthComparator lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        System.out.println("Comparison result: " + lengthComparator.compare("hello", "world!")); // Example usage

        //Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string. If n is larger than the length of the string, it should return the full string.
        @FunctionalInterface
        interface SubstringExtractor {
            String extract(String str, int n);
        }
        SubstringExtractor substringExtractor = (str, n) -> {
            if (n > str.length()) {
                return str;
            }
            return str.substring(0, n);
        };
        System.out.println("Extracted substring: " + substringExtractor.extract("Hello, World!", 5)); // Example usage

        //Create a functional interface that takes a List<Integer> and a function that takes an integer as input and returns an integer. Implement this interface using a lambda expression to apply the function to each element in the list, returning a new list with the mapped values.
        @FunctionalInterface
        interface ListMapper {
            List<Integer> map(List<Integer> list, java.util.function.Function<Integer, Integer> function);
        }
        ListMapper listMapper = (list, function) -> list.stream()
                .map(function)
                .collect(Collectors.toList());
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = listMapper.map(numbers, n -> n * n);
        System.out.println("Mapped list (squared): " + squaredNumbers); // Example usage

        //Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.
        @FunctionalInterface
        interface OddNumberFilter {
            List<Integer> filterOddNumbers(List<Integer> list);
        }
        OddNumberFilter oddNumberFilter = list -> list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        List<Integer> mixedNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = oddNumberFilter.filterOddNumbers(mixedNumbers);
        System.out.println("Filtered odd numbers: " + oddNumbers); // Example usage

        //Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.
        @FunctionalInterface
        interface UpperCaseFormatter {
            List<String> formatToUpperCase(List<String> names);
        }
        UpperCaseFormatter upperCaseFormatter = names -> names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<String> firstNames = List.of("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = upperCaseFormatter.formatToUpperCase(firstNames);
        System.out.println("Uppercase names: " + upperCaseNames); // Example usage

        //Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list. Implement this interface using a lambda expression.
        @FunctionalInterface
        interface ListContains<T> {
            boolean contains(List<T> list, T item);
        }
        ListContains<String> listContains = (list, item) -> list.contains(item);
        List<String> items = List.of("apple", "banana", "cherry");
        boolean containsBanana = listContains.contains(items, "banana");
        System.out.println("List contains 'banana': " + containsBanana); // Example usage

        //Create a functional interface with a method that takes two strings and returns a string. Implement this interface using a lambda expression to create a utility that joins two strings with a space in between.
        @FunctionalInterface
        interface StringJoiner {
            String join(String s1, String s2);
        }
        StringJoiner stringJoiner = (s1, s2) -> s1 + " " + s2;
        String joinedString = stringJoiner.join("Hello", "World");
        System.out.println("Joined string: " + joinedString); // Example usage

        //Create a functional interface that takes a single double as a parameter and returns a double. Implement it using a lambda expression to create a utility that returns the square root of the input value.
        @FunctionalInterface
        interface SquareRootCalculator {
            double calculate(double value);
        }
        SquareRootCalculator squareRootCalculator = Math::sqrt;
        double squareRoot = squareRootCalculator.calculate(16.0);
        System.out.println("Square root of 16.0: " + squareRoot); // Example usage

        //Create a functional interface called PairMaker which takes two parameters of type T and U and returns a Pair object that holds both values. The Pair class should be a generic class that can hold two values of any types. Your task is to implement the PairMaker using a lambda expression to instantiate Pair objects with the given values.
        @FunctionalInterface
        interface PairMaker<T, U> {
            Objects.Pair<T, U> makePair(T first, U second);
        }
        class Pair<T, U> {
            private final T first;
            private final U second;
            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }
            public T getFirst() {
                return first;
            }
            public U getSecond() {
                return second;
            }
            @Override
            public String toString() {
                return "Pair{" +
                        "first=" + first +
                        ", second=" + second +
                        '}';
            }
        }
        PairMaker<String, Integer> pairMaker = (first, second) -> new Objects.Pair<>(first, second);
        Objects.Pair<String, Integer> pair = pairMaker.makePair("Age", 30);
        System.out.println("Created pair: " + pair); // Example usage

        //Create a functional interface named ListFilter that works with generics. It should have a method that takes a list of elements of type T and a predicate functional interface, applying the predicate to filter elements of the list, returning a new list with elements that satisfy the predicate condition. Implement the ListFilter using a lambda expression and demonstrate its usage with different types of lists and predicates.
        @FunctionalInterface
        interface ListFilter<T> {
            List<T> filter(List<T> list, java.util.function.Predicate<T> predicate);
        }
        ListFilter<String> stringListFilter = (list, predicate) -> list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        List<String> stringList = List.of("apple", "banana", "cherry", "date");
        List<String> filteredStrings = stringListFilter.filter(stringList, s -> s.startsWith("a"));
        System.out.println("Filtered strings: " + filteredStrings); // Example usage
        ListFilter<Integer> integerListFilter = (list, predicate) -> list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredIntegers = integerListFilter.filter(integerList, n -> n % 2 == 0);
        System.out.println("Filtered integers: " + filteredIntegers);

    }
}
