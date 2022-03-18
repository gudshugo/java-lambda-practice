package com.company.exercise5;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * Exercise 5 is related to the usability of methods (static, instance or even constructors) converting to a lambda
 * with method reference.
 */


public class InterfacesFunctional3 {

    public static void main(String[] args){

        //This method reference is the same as var -> Integer.toString(var)
        IntFunction<String> intToString = Integer::toString;
        System.out.println(intToString.apply(777));

        //We can also use a constructor call with a method reference
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println(newBigInt.apply("1111111111"));

        //Another example of method reference using println() method
        Consumer<String> print = System.out::println;
        print.accept("Another test of consumer functional interface..");

        //Using concat() method with method reference
        UnaryOperator<String> sayHelloTo = "Hello, "::concat;
        System.out.println(sayHelloTo.apply("Carla"));

    }

}
