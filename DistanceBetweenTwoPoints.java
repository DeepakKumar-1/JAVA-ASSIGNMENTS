package com.company;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    // Calculate Distance Between Two Points
    public static void main(String [] args){
        /*
        Let  first  Point P  --> (x1 , y1)
             Second Point Q --> (x2 , y2)
            So distance between them --> d(P, Q) = √ (x2 − x1)^2 + (y2 − y1)^2
         */

        // Creating Scanner Object for Taking inputs from User
        Scanner sc = new Scanner(System.in);

        // Taking co-ordinates of First Point
        System.out.print(" Enter Co-Ordinates of First Point: ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        // Taking co-ordinates of Second Point
        System.out.print(" Enter Co-Ordinates of Second Point: ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        // Calculating Distance between These Two Points
        float distance = (float) (Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)));

        // displaying Distance on the Screen
        System.out.format(" Distance between points (%d, %d) and (%d, %d) is: %f",(int)(x1),(int)(y1),(int)(x2),(int)(y2),distance);
    }
}
