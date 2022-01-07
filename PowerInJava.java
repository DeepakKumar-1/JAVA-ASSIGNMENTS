package com.company;

import java.util.Scanner;
public class PowerInJava {
    // Power In Java
    public static void main(String [] args){
        /*
             (number)^power
             2 raise to 3 is --> 8
         */

        // Creating Scanner object for Taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking Any Number From the User
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        // Taking RaiseTo Value from the User
        System.out.print(" Raise to: ");
        int raiseTo = sc.nextInt();

        // Calculating Power of the Number
        float power = (float)(Math.pow(number, raiseTo));

        // Displaying Power on the Screen
        System.out.println(number + " raise to " + raiseTo + " is: " + power);
    }
}
