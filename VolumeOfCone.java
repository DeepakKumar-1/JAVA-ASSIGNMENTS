package com.company;

import java.util.Scanner;
public class VolumeOfCone {
    // Volume Of Cone Java Program
    public static void main(String[] args) {
        /*
        Volume Of Cone
            Volume = ( pi * r * r * h ) / 3
            pi --> Constant 3.147
            r  --> radius of the Cone
            h  --> height of the Cone
         */

        // Creating Scanner Object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Taking radius and height of the cone as a input from the user
        System.out.print(" Enter radius of the Cone:  ");
        int radius = sc.nextInt();

        System.out.print(" Enter height of the Cone:  ");
        int height = sc.nextInt();

        // Calculating volume of the Cone
        float volume = (float) (((Math.PI) * radius * radius * height) / 3);

        // Displaying volume on the Screen
        System.out.println(" Volume of the cone with radius " + radius + " and height " + height + " is: " + volume);

    }

}
