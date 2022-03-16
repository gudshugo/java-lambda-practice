package com.company.exercise2;

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
