package com.company;

import java.util.Scanner;

public class AreaOfParallelogram {
    // Area Of Parallelogram
    public static void main(String[] args) {
        /*
        Area of the parallelogram can be Calculated as :
        Area = Base * height
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Base Value of the Parallelogram: ");
        int base = sc.nextInt();

        System.out.print(" Enter Height Value of the Parallelogram: ");
        int height = sc.nextInt();

        // Calculating the Area of the parallelogram
        int area = base * height;

        // Displaying the Area on the Screen
        System.out.println(" Area of the Parallelogram with base " + base + " height " + height + " is: " + area);
    }
}
