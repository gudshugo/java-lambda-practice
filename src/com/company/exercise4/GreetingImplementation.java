package com.company.exercise4;

/**
 * Exercise 4 is related to a custom functional interface implementation called AuthorFunction.
 * The only abstract method inside the interface is called "say()" and expects one string param.
 */

public class GreetingImplementation {

    public static void main(String[] args){

        AuthorFunction author = message -> System.out.println("My Own Functional Interface written by " + message);
        author.say("Hugo");

    }

}
