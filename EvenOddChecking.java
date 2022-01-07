package com.company;

import java.util.Scanner;

public class EvenOddChecking {

    // Write a program to print whether a number is even or odd, also take input.
    public static void main(String[] args) {

        // Creating Scanner Object For Taking User Input
        Scanner sc = new Scanner(System.in);

        // Taking Any Number as a input from the user
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        // Checking if 2 divides the number then it will be EVEN otherwise ODD
        if (number % 2 == 0){
            System.out.println(number + " is EVEN ");
        } else{
            System.out.println(number + " is ODD ");
        }
    }
}
