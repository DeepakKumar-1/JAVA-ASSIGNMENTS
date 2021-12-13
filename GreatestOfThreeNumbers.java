package com.company;

import java.util.Scanner;
public class GreatestOfThreeNumbers {
    // The Largest Among three Number
    public static void main(String [] args){
        /*
        EXPLANATION:
            let n1, n2, n3 be three Numbers
            n1 is said to greatest if
                                  n1 > n2  and n1 > n3
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // taking three numbers as a Input from the USER
        System.out.print(" Enter Any Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Displaying Greatest Number Among these Three numbers
        System.out.println(" Greatest Number is: " + Math.max(a, Math.max(b,c)));
    }
}
