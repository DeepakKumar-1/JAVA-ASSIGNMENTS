package com.company;

import java.util.Scanner;
public class EvenOddUsingFunctions {
    // Define a program to find out whether a given number is even or odd.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Taking Any Number as a Input From the USER
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        System.out.println(number + " is: " + evenOdd(number));
    }

    static String evenOdd(int number){
        if(number % 2 == 0)
            return "Even";
        return  "Odd";
    }
}
