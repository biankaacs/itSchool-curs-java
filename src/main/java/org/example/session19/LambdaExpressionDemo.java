package org.example.session19;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello, World!");
        hello.sayHello();

        HelloName helloName = (name) -> System.out.println("Hello, " + name + "!");
        helloName.sayHello("Marcel");

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(addition.compute(10, 5));
        System.out.println(subtraction.compute(10, 5));
        System.out.println(multiplication.compute(10, 5));
        System.out.println(division.compute(10, 5));

        TextTransform toUpperCase = text -> text.toUpperCase();
        TextTransform toLowerCase = text -> text.toLowerCase();
        TextTransform reverseText = text -> new StringBuilder(text).reverse().toString();
        System.out.println(toUpperCase.transform("hello"));
        System.out.println(toLowerCase.transform("HELLO"));
        System.out.println(reverseText.transform("hello"));
    }
}
@FunctionalInterface
interface Hello{
    void sayHello();
}
@FunctionalInterface
interface HelloName {
    void sayHello(String name);
    }

@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}
@FunctionalInterface
interface TextTransform {
    String transform(String text);
}