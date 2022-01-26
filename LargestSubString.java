package com.company.DynamicProgramming;

public class LargestSubString {
    public static void main(String [] args){
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
        System.out.println(s.substring(1, s.length()));
    }
    public static String longestPalindrome(String s) {
        // Base Condition
        if(s.length() == 1)
            return s;
        return palindromeSubstring(s);
    }

    public static String palindromeSubstring(String s){
        if(isPalindrome(s)) {
            return s;
        }
        return palindromeSubstring(s.substring(1, s.length() -1));
    }
    static boolean isPalindrome(String s){
        if(s.length() == 1)
            return true;
        // Find Reverse of the String
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString().equals(s);
    }
}
