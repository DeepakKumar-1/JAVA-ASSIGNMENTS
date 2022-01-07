package com.company;

import java.util.Scanner;

public class PalindromeString {
    // Palindrome String Using Two Pointer Method
    public static void main(String[] args) {
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();

        if (isPalindrome(str))
            System.out.println(str + " is a Palindrome String ");
        else
            System.out.println(str + " is NOT a Palindrome String ");
    }
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        for(int i=0; i < str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }
}
