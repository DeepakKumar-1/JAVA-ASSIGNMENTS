package com.company;

import java.util.Scanner;
public class PerimeterOfCircle {
    // Perimeter Of Circle
    public static void main(String [] args){
        /*
        Perimeter Of Circle can be calculated as :
        Perimeter = 2 *  pi * r
        pi --> Constant 3.147
        r  --> radius of the Circle
         */

        // Creating Scanner Object for Taking input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Value of Radius as a Input from the user
        System.out.print(" Enter value of Radius of the Circle: ");
        int radius = sc.nextInt();

        // Calculating the Perimeter of the Circle
        float perimeter = (float)(2 * Math.PI * radius);

        // Displaying the perimeter of the Circle on the Screen
        System.out.println(" Perimeter of the Circle with Radius " + radius + " is: " + perimeter);
    }
}
