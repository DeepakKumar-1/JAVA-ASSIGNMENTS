package com.company.DynamicProgramming;

public class FibonacciNumberTopDownApproach {
    // Calculate nth Fibonacci Number Using DP
    public static void main(String [] args){
        int n = 3;
        System.out.println(fibM(n));
    }

    static int fibM(int n){
        // Create Array of SIZE n
        int [] storage = new int[n+1];
        // Assign all the Value of this Array as 0
        for(int i=0; i<=n; i++){
            storage[i] = -1;
        }
        // Now Calculate the Fibonacci Number
       return fib(n, storage);
    }
    public static int fib(int n, int [] storage){
        // Base Condition
        if(n == 0 || n == 1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }
        storage[n] = fib(n -1 , storage) + fib(n - 2, storage);
        return storage[n];
    }
}
