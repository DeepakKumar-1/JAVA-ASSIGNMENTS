package com.company;

import java.util.Scanner;

public class Greeting {
        // Take name as input and print a greeting message for that name.
        public static void main(String[] args) {

            // Creating Scanner Object for taking input from user
            Scanner sc = new Scanner(System.in);

            // Taking Name as a input From the User
            System.out.print(" Enter Your Name: ");
            String name = sc.nextLine();

            // Displaying Greeting Message
            System.out.println(" Good Morning " + name);

        }
    }

