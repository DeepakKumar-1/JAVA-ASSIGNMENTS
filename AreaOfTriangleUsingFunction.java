package com.company;

import java.util.Scanner;
public class AreaOfTriangleUsingFunction {
    // Area Of Triangle
    public static void main(String [] args){
        /*
        Area Of a Triangle
             Area = 1/2 * base * height
         */

        // Creating Scanner object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking Base and Height of a Triangle as a Input From the User
        System.out.print(" Enter Value of Base of the Triangle: ");
        int base = sc.nextInt();

        System.out.print(" Enter Value of Height of the Triangle: ");
        int height = sc.nextInt();

        // Displaying Area on the Screen
        System.out.println(" Area of the Triangle with Base " + base + " and height " + height + " is: " + area(base , height));

    }

    static float area(int base , int height){
        // Calculating Area of the Triangle
        // and return it
          return (float)(base * height) / 2;
    }
}
