package com.company;

import java.util.Scanner;
public class EvenOrOddUsingSwitch {
    // Check whether a Number is Even or Odd Using Switch Case
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take any Number as a Input from the USER
        System.out.print(" Enter Any Number: ");
        int a = sc.nextInt();
        switch (a % 2){
            case 0:
                System.out.println(a + " is an Even Number");
                break;
            default:
                System.out.println(a + " is an Odd Number");
        }
    }

}
