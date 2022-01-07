package com.company;

import java.util.Scanner;
public class VolumeOfSphere {
    // Volume Of Sphere
    public static void main(String[] args) {
        /*
        Volume Of Sphere can be Calculated as:
          volume of Sphere = 4 * ( pi * r * r )/ 3
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking radius of Sphere as a input From the User
        System.out.print(" Enter the value of radius of the Sphere: ");
        int radius = sc.nextInt();

        // Calculating the Volume of the Sphere
        float volume = (float) ((4 * Math.PI * radius * radius * radius) / 3);

        // Displaying Volume on the Screen
        System.out.println(" Volume of the Sphere with Radius " + radius + " is: " + volume);

    }
}
