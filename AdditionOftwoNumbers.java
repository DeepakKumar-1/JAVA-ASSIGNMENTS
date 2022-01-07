package com.company;

import java.util.Scanner;
public class AdditionOftwoNumbers {
    // Addition Of Two Numbers
    public static void main(String [] args){
        /*
        Addition Of Two Numbers
        Sum = A + B
        A --> First Number
        B --> Second Number
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking First Number as Input From User
        System.out.print(" Enter First Number: ");
        int a = sc.nextInt();

        // Taking Second Number as Input
        System.out.print(" Enter Second Number: ");
        int b = sc.nextInt();

        // Calculating Sum of Two Numbers
        int sum = a+b;

        // Displaying Sum on the Screen
        System.out.println(" Sum is: " + sum);
    }
}
