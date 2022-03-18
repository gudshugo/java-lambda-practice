package com.company.exercise2;

/**
 * Exercise 2 is a demonstration of Runnable implementation with and without lambda expressions.
 */

public class RunnableLambda {

    public static void main(String[] args){

       //Runnable call without lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Opening a thread without lambda :(");
            }
        };

        //Runnable call with lambda expression
        Runnable r2 = () -> System.out.println("Opening a thread with lambda :)");

        r1.run();
        r2.run();

    }

}
