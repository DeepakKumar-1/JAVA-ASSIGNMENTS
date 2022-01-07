package com.company;

import java.util.Scanner;

public class RupeeToUsd {
    // Input currency in rupees and output in USD.
    public static void main(String[] args) {

        // Creating Scanner Object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking Input as Rupees From the User
        System.out.print(" Enter Rupees : ");
        int rupees = sc.nextInt();

        // Converting Rupees to USD
        // 1 Indian Rupee = 0.0133344268 United States Dollar
        // 1 United States Dollar = 74.99385 Indian Rupee
        float usd = rupees * 0.0133344268f;

        // Displaying USD on Screen
        System.out.println(rupees + " in USD = "+usd);
    }
}
