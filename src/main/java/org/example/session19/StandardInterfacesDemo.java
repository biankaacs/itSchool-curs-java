package org.example.session19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandardInterfacesDemo {
    public static void main(String[] args) {
        // Runnable example, no input parameters, no return simple action
        Runnable sayHello = () -> System.out.println("Hello from Runnable!");
        sayHello.run();

        //Consumer example, takes an input and performs an action, no return value
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Today is Monday!");

        //Predicate example, takes an input and returns a boolean value
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        //Function example, takes an input and returns a value
        Function<String,Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        //Supplier example, no input, returns a value
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random number: " + randomValue.get());

    }
}
