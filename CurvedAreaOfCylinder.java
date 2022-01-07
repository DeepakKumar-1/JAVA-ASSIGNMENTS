package com.company;

import java.util.Scanner;
public class CurvedAreaOfCylinder {
    // Curved Surface Area Of Cylinder
    public static void main(String[] args) {
        /*
        Curved Surface Area Of Cylinder
             Curved Area = 2 * pi * r * h
             pi --> Pi 3.141
             r  --> Radius of the Cylinder
             h  --> height of the Cylinder
         */

        // Creating Scanner Object for Taking Input from the user
        Scanner sc = new Scanner(System.in);

        // Taking radius and Height of Cylinder as a input from the User
        System.out.print(" Enter radius of the Cylinder: ");
        int radius = sc.nextInt();

        System.out.print(" Enter height of the Cylinder: ");
        int height = sc.nextInt();

        // Calculating Curved Surface Area of the Cylinder
        float curvedArea = (float) (2 * Math.PI * radius * height);

        System.out.println(" Curved Surface area of the Cylinder with radius " + radius + " and height " + height + " is: " + curvedArea);
    }
}
