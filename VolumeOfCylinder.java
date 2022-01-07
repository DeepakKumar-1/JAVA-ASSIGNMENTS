package com.company;

import java.util.Scanner;
public class VolumeOfCylinder {
    // Volume Of Cylinder
    public static void main(String[] args) {
        /*
        Volume of the Cylinder can be Calculated as:
            volume = pi * r * r * h
            pi --> Constant 3.1415
            r  --> radius
            h  --> height
         */

        // Creating Scanner object for Taking input from the user
        Scanner sc = new Scanner(System.in);

        // taking radius and height of Cylinder as a input from the User
        System.out.print(" Enter the radius of the Cylinder: ");
        int radius = sc.nextInt();

        System.out.print(" Enter the height of the Cylinder: ");
        int height = sc.nextInt();

        // Calculating Volume of the Cylinder
        float volume = (float) (Math.PI * radius * radius * height);

        // Displaying volume on the Screen
        System.out.println(" Volume of the Cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }
}
