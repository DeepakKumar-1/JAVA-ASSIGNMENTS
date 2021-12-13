package com.company;

import java.util.Scanner;
public class EvenOrOdd {
    // The Number is EVEN or ODD
    public static void main(String [] args){
        /*
        EXPLANATION:
             EVEN Number --> IF Number is Divisible by 2
             ODD Number  --> Not Divisible by 2
         */
        // Creating Scanner Object for Taking Inputs From the USER
        Scanner sc = new Scanner(System.in);
        // Take any Number as a Input from the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        // If Divisible by 2 Means EVEN
        if( num % 2 == 0)
            System.out.println(num + " is EVEN ");
        else
            System.out.println(num + " is ODD ");

    }
}
