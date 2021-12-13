package com.company;

import java.util.Scanner;
public class FibonacciSeries {
    // Display Fibonacci Series
    public static void main(String [] args){
        /*
        Fibonacci Series
                    0, 1, 1, 2, 3, 5, 8 ...........
               Fib(n) = fib(n-1) + fib(n-2)
               Base Conditions,  fib(0) = 0
                                 fib(1) = 1
         */

        // Creating scanner Input For Taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Nth Term for the Fibonacci Series
        System.out.print(" Enter nth Term for the Fibonacci Series: ");
        int n = sc.nextInt();
        // Check if n is 0 then Display 0
        if(n == 0){
            System.out.println(" Fibonacci Series is: " + n);
        } else if(n == 1){ // if n is 1 then Display 0 and 1
            System.out.println(" Fibonacci Series is: " + 0 + 1);
        } else{
            int term1 = 0;
            int term2 = 1;
                System.out.print(" Fibonacci Series is: " + term1 + " " +  term2 );
                for (int i = 2; i <= n; i++) {
                    int sum = term1 + term2;
                    System.out.print(" " + sum);
                    term1 = term2;
                    term2 = sum;
                }
        }
    }
}
