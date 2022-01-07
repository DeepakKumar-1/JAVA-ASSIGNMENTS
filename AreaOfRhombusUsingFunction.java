package com.company;

import java.util.Scanner;
public class AreaOfRhombusUsingFunction {
    // Area Of Rhombus
    public static void main(String [] args){
        /*
        Area of the Rhombus
            Area = d1 * d2
            d1 --> First Diagonal
            d2 --> Second Diagonal
         */

        // Creating Scanner Object for Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Diagonals as a Input From the User
        System.out.print(" Enter Value of First Diagonal: ");
        int d1 = sc.nextInt();

        System.out.print(" Enter Value of Second Diagonal: ");
        int d2 = sc.nextInt();

        System.out.println(" Area of the Rhombus with Diagonals "+ d1 + " and "+ d2 + " is: " + area(d1,d2));
    }

    static int area(int d1 , int d2){
        return d1*d2;
    }
}
