package com.company;

import java.util.Scanner;
public class AreaOfCircleUsingFunction {
    // Area Of Circle Java Program
    public static void main(String [] args){
        /*
        Area of Circle = pi * r * r
        pi --> Constant 3.14
        r  --> Radius of the Circle
         */

        // Creating Scanner Object for Taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Radius of a Circle as a Input From the User
        System.out.print(" Enter Radius of a Circle: ");
        int radius = sc.nextInt();

        // Displaying Area on the Screen
        System.out.println(" Area of the Circle with Radius " + radius + " is: " + area(radius));
    }

    static float area(int radius){
        return (float)(Math.PI*radius*radius);
    }
}
