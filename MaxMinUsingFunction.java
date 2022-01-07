package com.company;

import java.util.Scanner;
public class MaxMinUsingFunction {
    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public static void main(String [] args){

        // Creating Scanner Object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking three numbers as a input from the User
        System.out.print(" Enter Any Three Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Passing these numbers to the Functions
        System.out.println(" Maximum of " + num1 + " " + num2 + " " + num3 + " is: " + max(num1,num2,num3) ) ;
        System.out.println(" Minimum of " + num1 + " " + num2 + " " + num3 + " is: " + min(num1,num2,num3) ) ;
    }

    static int max(int a, int b, int c){
        int maxNumber = a;
        if(b > maxNumber){
            maxNumber = b;
        }
        if( c > maxNumber){
            maxNumber = c;
        }
        return maxNumber;
    }

    static int min(int a, int b, int c){
        int minNumber = a;
        if(b < minNumber){
            minNumber = b;
        }
        if( c < minNumber){
            minNumber = c;
        }
        return minNumber;
    }

}
