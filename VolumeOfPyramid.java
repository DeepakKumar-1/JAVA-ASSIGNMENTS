package com.company;

import java.util.Scanner;
public class VolumeOfPyramid {
    //Volume Of Pyramid
    public static void main(String[] args) {
        /*
        Volume Of Pyramid
            Volume = l * w * h
            l --> Base length
            w --> Base width
            h --> Pyramid height
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Base Length, Base width and Pyramid height as a input from the User
        System.out.print(" Enter Base length of the Pyramid: ");
        int baseLength = sc.nextInt();

        System.out.print(" Enter Base width of the Pyramid: ");
        int baseWidth = sc.nextInt();


        System.out.print(" Enter Pyramid height of the Pyramid: ");
        int pyramidHeight = sc.nextInt();

        // Calculating the Volume Pyramid
        float volume = baseLength * baseWidth * pyramidHeight;

        // Displaying Volume of Pyramid on the Screen
        System.out.println(" Volume of the Pyramid with base Length " + baseLength +
                " base width " + baseWidth + " and pyramid Height " + pyramidHeight +
                " is: " + volume);


    }
}
