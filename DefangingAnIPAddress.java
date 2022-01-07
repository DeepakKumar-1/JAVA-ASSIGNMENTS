package com.company;

import java.util.Scanner;

public class DefangingAnIPAddress {
    // Defanging an IP Address
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/defanging-an-ip-address/
        Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking IP Address as a input from the USER
        System.out.print(" Enter IP Address: ");
        String address = sc.next();
        // Display the Resultant IP Address
        System.out.println(" Resultant IP Address is: " + defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
	/*
	CODE EXPLANATION
	   Replace Every Occurrence of . with [.] by using replace Method of String
	   replace method will not change the Original String Because Strings are Immutable in JAVA
	   So, it will return a New Object Store that Object in String result
	   And at the End Just return the result
	*/
        return address.replace("." , "[.]");
    }
}
