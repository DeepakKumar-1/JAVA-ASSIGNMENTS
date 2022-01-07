package com.company;

public class FibonacciNumberUsingRecurrence {
    // fibonacci Number Using Recurrence
    public static void main(String [] args){
        // Print First 50th Terms of recurrence relation
        for(int i=0; i<= 50; i++){
            System.out.print(" " + fib(i));
        }
    }

    static long fib(int n){
        return (long)(((Math.pow(((1+ Math.sqrt(5))/2), n)) - (Math.pow(((1- Math.sqrt(5))/2), n))) / Math.sqrt(5));
    }
}
