package com.company;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        if(isArmstrong(number))
            System.out.println(number + " is an Armstrong Number ");
        else
            System.out.println(number + " is not an Armstrong Number ");
    }

    static boolean isArmstrong(int number){

        // Calculate the Digits in a number First
        int numberOfDigits = count(number);

        int sum = sumOfDigitsWithPowerCount(number , numberOfDigits);  // Here copy is Passed so doesn't need to Store
        // copy of a number in Original number Variable

        return number == sum;
    }

    static int count(int number){
        int count = 0;
        while(number > 0){
//            int remainder = number % 10;
            count ++;
            number /= 10;
        }
        return count;
    }

    static int sumOfDigitsWithPowerCount(int number , int count){
        int sum = 0;
        while(number > 0){
            int remainder = number % 10;
            sum += Math.pow(remainder,count);
            number = number /10;
        }
        return  sum;
    }

}
