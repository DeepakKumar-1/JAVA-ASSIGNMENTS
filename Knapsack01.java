package com.company.DynamicProgramming;

public class Knapsack01 {

    private static int knapsack(int []weight, int []values, int maxWeight, int i){
        // Base Case:
        if(i == weight.length || maxWeight == 0){
            return 0;
        }
        if(weight[i] > maxWeight){
            return  knapsack(weight, values, maxWeight, i+1);
        } else{
            // lets include this item
            int opt1 = values[i] + knapsack(weight, values, maxWeight - weight[i], i+1);
            // don't include
            int opt2 = knapsack(weight, values, maxWeight, i+1);
            return Math.max(opt1, opt2);
        }
    }
    private static int knapsack(int []weights, int []values, int maxWeight){
        return knapsack(weights, values, maxWeight, 0);
    }

    public static void main(String []args){

        int []weights = {6, 1, 2, 4, 5};
        int []values = {10, 5, 4, 8, 6};
        int maxWeight = 5;
        int res = knapsack(weights, values, maxWeight);
        System.out.println(res);

    }
}
