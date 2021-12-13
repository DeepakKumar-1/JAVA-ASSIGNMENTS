package com.company;

import java.util.Scanner;
public class TriangleValidity {
    // Input Angle of a Triangle and Check whether the Triangle is Valid or Not
    public static void main(String [] args){
        /*
        EXPLANATION:
           Triangle if Said to be VALID
           SUM of Angles is 180
           i.e  angle1 + angle2 + angle3 = 180 Degree
         */
        // Creating Scanner Object For Taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Three angles from the USER
        System.out.print(" Enter Angles of the Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check if Sum of all angles is 180 then Print Valid Triangle
        if ( a+b+c == 180 )
            System.out.println(" Triangle with angles " + a + ", "+b +" and " + c + " is a Valid Triangle");
        else
            System.out.println(" Triangle with angles " + a + ", "+b +" and " + c + " is NOT a Valid Triangle");
    }
}
