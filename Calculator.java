package com.company;

import java.util.Scanner;
public class Calculator {
    // Calculator
    public static void main(String [] args){
        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Two Numbers from the USER
        System.out.print(" Welcome to Calculator World ");
        System.out.print(" Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Take Operator from the USER
        System.out.print(" Enter Operation that you want to Operation: ");
        char operator = sc.next().charAt(0);
        // Perform Operation According to Operator of USER's Choice
        switch(operator){
            case '+' -> { System.out.println(" Sum is: " + (a+b)); }
            case '-' -> { System.out.println(" Subtraction is: " + (a-b)); }
            case '*' -> { System.out.println(" Multiplication is: " + (a*b)); }
            case '/' -> { System.out.println(" Division is: " + (a/b)); }
            case '%' -> { System.out.println(" Modulus is: " + (a%b)); }
            default -> { System.out.println(" Wrong Input!! "); }
        }

    }
}
