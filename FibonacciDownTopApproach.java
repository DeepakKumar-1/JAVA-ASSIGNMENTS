package com.company.DynamicProgramming;

public class FibonacciDownTopApproach {
    public static void main(String [] args){
        int n = 5;
        System.out.println(fibDP(n));
    }

    public static int fibDP(int n){
        // Create An Array of SIZE = n
        int [] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
}
