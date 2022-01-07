package com.company;

import java.util.Scanner;

public class Calculation {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {

        // Creating Scanner Object for taking inputs from the user
        Scanner sc = new Scanner(System.in);

        // Taking Two Numbers as a input from the user
        System.out.print(" Enter First Number: ");
        float num1 = sc.nextFloat();

        System.out.print(" Enter Second Number: ");
        float num2 = sc.nextFloat();

        // Taking Operator for Performing Calculation:
        System.out.print(" Enter any Operator (+,-,*,/): ");
        String operator = sc.next();

        if (operator.equals("+")){
            System.out.println(" Sum is : " + (num1+num2));
        } else if (operator.equals("-")){
            System.out.println(" Subtraction is : " + (num1-num2));
        } else if (operator.equals("*")){
            System.out.println(" Multiplication is : " + (num1*num2));
        } else if (operator.equals("/")){
            System.out.println(" Division is : " + (num1/num2));
        } else{
            System.out.println(" Wrong Input!! ");
        }



    }
}
