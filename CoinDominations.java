package com.company.DynamicProgramming;

import java.util.Arrays;

public class CoinDominations {
    public static void main(String [] args){
        // Available Coins 1,7, 10
        int n = 20;
        // Create and Storage Array
        int[] storage = new int[n + 1];
        Arrays.fill(storage, -1);
        System.out.println(minCoinCount(n, storage));
    }

    static int minCoinCount(int n, int [] storage){
        if(n == 0){
            storage[n] = 0;
            return storage[n];
        }

        // Look Up in the Storage Array if the ans is Calculated or not
        if(storage[n] != -1){
            return storage[n];
        }

        // Now There are three Possible Operations
        // Take One Operation count as a min
        int op1 = minCoinCount(n-1, storage);
        int minCount = op1;

        // Now Apply Another three Possibilities
        if(n-7 >= 0){
            int op2 = minCoinCount(n-7, storage);
            if(minCount > op2)
                minCount = op2;
        }
        if(n-10 >= 0){
            int op3 = minCoinCount(n-10, storage);
            if(minCount > op3)
                minCount = op3;
        }

        storage[n] = 1 + minCount;
        return storage[n];
    }
}
