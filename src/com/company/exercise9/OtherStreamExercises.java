package com.company.exercise9;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Exercise 9 is related to some special streams for some primitive data types.
 */

public class OtherStreamExercises {

    public static void main(String[] args){

        //Using .range() method to put inside a stream numbers 1, 2 e 3 e print them out.
        IntStream.range(1,4)
                .forEach(System.out::println);

        //Calculate the average for the given numbers inside a primitive int array.
        Arrays.stream(new int[]{1,2,3,4})
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        //Mapping double values to int
        Stream.of(1.5, 2.3,3.7)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
    }

}
