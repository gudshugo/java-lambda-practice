package com.company.exercise6;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * Exercise 6 is related to the creation of my own customized Functional Interface named Calculator (in order
 * to calculate some values with add, subtraction, divide and multiply operations).
 */


public class InterfacesFunctional4 {

    public static void main(String[] args){

        Calculator add = Integer::sum;
        Calculator difference = (a,b) -> Math.abs(a-b);
        Calculator divide = (a,b) -> (b!=0 ? a/b : 0);
        Calculator multiply = (a,b) -> a*b;

        System.out.println(add.calc(3,2));
        System.out.println(difference.calc(10,2));
        System.out.println(divide.calc(12,6));
        System.out.println(divide.calc(3,0));
        System.out.println(multiply.calc(3,2));

    }

}
