package com.company.exercise8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 8 is related to the usability of Streams API together with lambda annotations.
 */


public class StreamExamples {

    public static void main(String[] args){

        //Example of usability of stream sorting a stream and returning its first value.
        Stream.of("red", "yellow", "black")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //Example of usability of filter function filtering all elements which starts with "a".
        Stream.of("apple", "orange", "cherry", "apricot")
                .filter(fruit -> fruit.startsWith("a"))
                .forEach(fruit -> System.out.println("Starts with A: " + fruit));

        //Using map to create a new List of greetings examples in capital letters.
        List<String> listOfGreetings = Stream.of("Well", "Good", "Nice")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(listOfGreetings);
    }

}
