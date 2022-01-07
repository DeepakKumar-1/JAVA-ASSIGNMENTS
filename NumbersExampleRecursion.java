package com.company;

public class NumbersExampleRecursion {
    public static void main(String [] args){
        // Write a Function that will print First Five Numbers
        numbers(1);
    }

    static void numbers(int num){
        System.out.print( num + " ");
        // Base Condition
        if(num == 5)
            return;
        numbers(num + 1);
    }
}
