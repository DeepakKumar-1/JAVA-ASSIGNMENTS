package com.company;
import java.lang.Math;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String [] args){
        // Creating Scanner Object For Taking inputs from user
        Scanner sc = new Scanner(System.in);

        // Taking Number as a input From user
        System.out.print(" Enter Any Number : ");
        int number = sc.nextInt();

        int num = number;

        int number1 =  0;
        // Firstly calculate the number of digits of a number
        // Method 1
        int count = 0;
        int num1 = number;
        while(num1>0){
            count++;
            num1 = num1/10;
        }
        System.out.println(count);

        while(num > 0){
            int remainder = num % 10;
            number1 =  number1 + (int)(Math.pow(remainder,count));
            num = num/10;
        }

        if (number == number1){
            System.out.println(number + " is an Armstrong Number ");
        } else{
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
