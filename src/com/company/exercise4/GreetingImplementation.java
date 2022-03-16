package com.company.exercise4;

public class GreetingImplementation {

    public static void main(String[] args){

        AuthorFunction author = message -> System.out.println("My Own Functional Interface written by " + message);
        author.say("Hugo");

    }

}
