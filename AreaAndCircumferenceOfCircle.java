package com.company;

import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
    // Area and Circumference of Circle
    public static void main(String [] args){
        /*
        Area and Circumference of the Circle
        Area of the Circle --> PI * r * r
        Circumference of the Circle --> 2 * PI * r
        here,
             PI --> CONSTANT 3.1415
             r  --> Radius of the Circle
         */
        // creating Scanner Object for taking Input From the USER
        Scanner sc = new Scanner(System.in);
        // Take the Radius of the Circle From the User
        System.out.print(" Enter value of Radius of the Circle: ");
        int r = sc.nextInt();
        // Calculations
        float area      = (float)(Math.PI * r * r);
        float perimeter = (float)(2 * Math.PI * r);

        // Display the Area and Circumference on the Screen
        System.out.println(" Area of the Circle with Radius " + r + " is: " + area);
        System.out.println(" Circumference of the Circle with Radius " + r + " is: "+ perimeter);
        System.out.print(" Do You Want to See the Calculation (y or n)? ");
        char inputChoice = (sc.next()).charAt(0);
        switch (inputChoice){
            case 'y':
            case 'Y':
                System.out.println(" Area of the Circle: " + " πr^2 " );
                System.out.println(" Given, \n     Radius: " + r + "\n     Area: " + "π * " + r +" * " + r);
                System.out.println( "    Area: " + Math.PI + " * " + Math.pow(r,2));
                System.out.println("     Area: " + (float)(Math.PI*Math.pow(r,2)));
                System.out.println();
                System.out.println(" Circumference of the Circle: " + " 2πr " );
                System.out.println(" Given, \n     Radius: " + r + "\n     Circumference: " + " 2 * " + "π * " + r +" * " + r);
                System.out.println("     Circumference: " + 2 + " * "+Math.PI + " * " + r);
                System.out.println("     Circumference: " + (float)(2*Math.PI*r));
                break;
            case 'n':
            case 'N':
                return;
            default:
                System.out.println(" Wrong Input !!");
        }
    }
}
