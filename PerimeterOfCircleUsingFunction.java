package com.company;

import java.util.Scanner;
public class PerimeterOfCircleUsingFunction {
    // Perimeter Of Circle
    public static void main(String [] args){
        /*
        Perimeter Of Circle
             P = 2 * PI * r
             PI --> constant 3.1415
             r  --> Radius of the Circle
         */

        // Creating Scanner Object For Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Radius of the Circle as a Input from the User
        System.out.print(" Enter Radius of the Circle: ");
        int radius = sc.nextInt();

        System.out.println(" Perimeter of the Circle with Radius " + radius + " is: " + perimeter(radius));
    }

    static float perimeter(int radius){
        return (float)(2 * Math.PI * radius);
    }
}
