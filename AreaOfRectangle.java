package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    // Area Of Rectangle Program
    public static void main(String [] args){
        /*
        Area of Rectangle can be Calculated as
             Area = length * breath
         */

        // Creating Scanner Object For taking inputs from the User
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Length of the Rectangle: ");
        int length = sc.nextInt();

        System.out.print(" Enter the breath of the Rectangle: ");
        int breath = sc.nextInt();

        // Calculating the Area of the Rectangle
        int area = length * breath;

        // Displaying Area on the Screen
        System.out.println(" Area of the Rectangle with length " + length + " and breath "+ breath + " is: " + area);


    }
}
