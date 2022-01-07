package com.company;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String [] args){

        // Creating Scanner Object For taking input From the user
        Scanner sc = new Scanner(System.in);

        // Taking String as a Input From the User
        System.out.print(" Enter Any String : ");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();

        if(str.equalsIgnoreCase(str1)){
            System.out.println(str + " is Palindrome ");
        } else{
            System.out.println(str + " is not Palindrome ");
        }

    }
}
