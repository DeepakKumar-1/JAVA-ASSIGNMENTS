package com.company;

public class PalindromeStringUsingStringMethods {
    // Palindrome String Using String Methods
    public static void main(String [] args){
        String str = "Deepak";
        StringBuilder builder = new StringBuilder();
        builder.append(str);

        if(str.equalsIgnoreCase(String.valueOf(builder.reverse())))
            System.out.println( str + " is a Palindrome String " );
        else
            System.out.println( str + " is NOT a Palindrome String " );
    }
}
