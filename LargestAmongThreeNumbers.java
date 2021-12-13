package com.company;

import java.util.Scanner;
public class LargestAmongThreeNumbers {
    // Largest Number Among Three Numbers
    public static void main(String [] args){
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take three numbers as a Input from the USER
        System.out.print(" Enter Any three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Integer.MIN_VALUE;
        // Check if a is Greater than Max or Not ?
        // if yes then update the max
        // Similarly check for Other Numbers
        if(a > max)
            max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        // Display the Maximum Number
        System.out.println(" Maximum Number is: " + max);
    }
}
