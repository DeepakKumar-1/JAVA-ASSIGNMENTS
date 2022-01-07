package com.company;

import java.util.Scanner;
public class VolumeOfPrism {
    // Volume Of Prism
    public static void main(String[] args) {
        /*
        Volume Of Prism
           Volume = B * h --> length * width * height
           B --> Base Area = length * width
         */

        // Creating Scanner object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking length, width and height as a input from the User
        System.out.print(" Enter length of the prism: ");
        int length = sc.nextInt();

        System.out.print(" Enter width of the prism: ");
        int width = sc.nextInt();

        System.out.print(" Enter height of the prism: ");
        int height = sc.nextInt();

        // Calculating Volume of the Prism
        int volume = length * width * height;

        // Displaying Volume on the Screen
        System.out.println(" Volume of the Prism with length " + length + " width " + width + " and height " + height + " is: " + volume);
    }
}
