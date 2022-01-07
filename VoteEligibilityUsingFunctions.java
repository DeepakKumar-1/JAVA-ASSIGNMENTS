package com.company;

import java.util.Scanner;
public class VoteEligibilityUsingFunctions {
    // A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        // Taking Age of user as a Input
        System.out.print(" Enter Your Age: ");
        int age = sc.nextInt();

        // Passing Age to the Function
        voteEligibility(age);
    }

    static void voteEligibility(int age){
        if(age >= 18){
            System.out.println(" You Are Eligible to Vote ");
        }else {
            System.out.println(" You Are not Eligible to Vote ");
        }
    }
}
