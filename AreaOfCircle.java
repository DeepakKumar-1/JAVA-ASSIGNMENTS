package com.company;

import java.util.Scanner;
public class AreaOfCircle {
    // Area Of Circle Java Program
    public static void main(String [] args){
        /*
        Area of Circle = pi*r*r
        where pi is a Constant ( pi = 3.14 )
        r ---> Radius of Circle
         */

        // Creating Scanner Object for taking input from the user
        // To Use Scanner Object Don't Forget to *****  import java.util.Scanner  *****
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Radius of the Circle: ");
        int radius = sc.nextInt();

        // Calculation Part
        float area = (float)(Math.PI * radius * radius);
        // Printing the Area of the Circle on the Screen
        System.out.println(" Area of the Circle is: " + area );

    }
}
