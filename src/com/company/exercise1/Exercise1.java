package com.company.exercise1;

import java.util.function.*;

/**
 * Exercise 1 is related to implementations of some functional interfaces in Java, such as: Predicate,
 * Consumer, Function, Supplier, BinaryOperator and UnaryOperator.
 */

public class Exercise1 {

    public static void main(String[] args) {

        //Predicate
        Predicate<String> predicateString = (s) -> s.contains("%");
        System.out.println(predicateString.test("https://www.google.com%"));

        //Consumer
        Consumer<String> consumerString = (s) -> System.out.println(s.toUpperCase());
        consumerString.accept("mytestword");

        //Function
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("Calculating the length of 4000: " + converter.apply(4000).length());

        //Supplier
        Supplier<String> supplierString = () -> "Test string";
        System.out.println(supplierString.get());

        //Binary Operator
        BinaryOperator<Integer> add = (a,b) -> a + b;
        System.out.println("40 + 15: " + add.apply(40, 15));

        UnaryOperator<String> str = (msg) -> msg.toLowerCase();
        System.out.println(str.apply("CONVERTING THIS SENTENCE TO LOWER CASE"));
    }
}
