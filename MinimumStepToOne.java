package com.company.DynamicProgramming;
import java.util.Scanner;
public class MinimumStepToOne {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Take Any Number from the USER
        int n = sc.nextInt();
        // Display the Minimum Step to Go to One
        // Conditions n/2, n/3, n-2
        int [] dp = new int[n + 1];
        System.out.println(countStepsM(n, dp));
    }

    public static int countStepsM(int n, int [] storage){
        // Base Case
        if (n == 1) {
            storage[n] = 0;
            return storage[n];
        }
        if (storage[n] != 0) {
            return storage[n];
        }

        int op1 = countStepsM(n - 1, storage);
        int minSteps = op1;
        if (n % 3 == 0) {
            int op2 = countStepsM(n / 3, storage);
            if (minSteps > op2)
                minSteps = op2;
        }
        if (n % 2 == 0) {
            int op3 = countStepsM(n / 2, storage);
            if (minSteps > op3)
                minSteps = op3;
        }
        storage[n] = 1 + minSteps;
        return storage[n];
    }
}
