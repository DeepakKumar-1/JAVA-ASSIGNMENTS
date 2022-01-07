package com.company;

import java.util.Scanner;
public class FactorsOfNumber {
    // Input a number and print all the factors of that number (use loops).
    public static void main(String [] args){
        // Creating Scanner Object for Taking Input from the User
        Scanner sc = new Scanner(System.in);

        // Taking any Integer Number a Input from the User
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        System.out.print(" Factors of " + number + " are: ");
        for(int i = 1;i<= number; i++){
            if (number % i == 0){
                System.out.print( " " + i);
            }
        }
    }
}
