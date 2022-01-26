package com.company.DynamicProgramming;

public class MinimumNumberOfChocolates {

    private static int getMinChocolates(int []arr){
        int n = arr.length;
        int []dp = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                dp[i] = 1 + dp[i-1];
            } else{
                dp[i] = 1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
                dp[i] = dp[i+1] + 1;
            }
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += dp[i];
        }
        return sum;
    }

    public static void main(String []args){
        int []arr = {2, 3, 8, 1, 5, 4, 6, 7};
        int res = getMinChocolates(arr);
        System.out.println(res);
    }
}
