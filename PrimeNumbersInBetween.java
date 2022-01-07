package com.company;

import java.util.Scanner;
public class PrimeNumbersInBetween {
    // Write a function that returns all prime numbers between two given numbers.
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Start and End Range for the Prime Numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(" Prime Numbers In Between " + start + " and " + end + " are: ");
        primeNumbers(start,end);
    }

    static void primeNumbers(int start, int end){
        for(int i=start ; i<= end ; i++){
            boolean isPrime = true;
            if (i == 1)
                continue;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                   isPrime = false;
                }
            }
            if(isPrime)
                System.out.print(" " + i);
        }
    }

}
