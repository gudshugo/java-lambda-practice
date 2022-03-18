package com.company.exercise3;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Exercise 3 is related to others implementations of Functional Interfaces using BiFunction and Consumer.
 */


public class InterfacesFunctional2 {

    public static void main(String[] args){

        //BiFunction
        BiFunction<String, String, String> concat = (a,b) -> a + b;
        String phrase = concat.apply("Here is ", "a BiFunction example");
        System.out.println(phrase);

        //Consumer
        Consumer<String> hello = name -> System.out.println("Hello, " + name);
        for(String name : Arrays.asList("Bruno", "Camila")){
            hello.accept(name);
        }

    }

}
