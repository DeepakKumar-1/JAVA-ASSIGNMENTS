package com.company;
import java.util.Scanner;
public class AreaOfTriangle {
    // Print the Area of the Triangle
    public static void main(String [] args){
        /*
        Area of the Triangle is
        Area = (Base * height) /2
         */

        // Creating Scanner Object for taking Input From the USER
        Scanner sc = new Scanner(System.in);
        // Taking Required Inputs from the USER
        System.out.print(" Enter Base and Height Value of the Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        // Calculation
        float area = (float)(base*height) / 2;
        // Display the Area of the Triangle on the Screen
        System.out.println(" Area of Triangle with Base value " + base + " Height " + height + " is: " + area);
    }
}
