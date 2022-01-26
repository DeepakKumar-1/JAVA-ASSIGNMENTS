package com.company.DynamicProgramming;

public class LootHouses {

    private static int maxMoneyLooted(int []houses){
        int n = houses.length;

        // Special Case
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return houses[0];
        }
        int []maxMoneyCanBeLooted = new int[n];
        maxMoneyCanBeLooted[0] = houses[0];
        maxMoneyCanBeLooted[1] = Math.max(houses[0], houses[1]);

        for(int currHouse = 2; currHouse < n; currHouse++){
            maxMoneyCanBeLooted[currHouse] = Math.max(maxMoneyCanBeLooted[currHouse - 1],
                    (houses[currHouse] + maxMoneyCanBeLooted[currHouse - 2]));
        }
        return maxMoneyCanBeLooted[n-1];
    }

    public static void main(String []args){
        int[] houses =  {5, 3, 4, 11, 2};
        int res = maxMoneyLooted(houses);
        System.out.println(res);
    }
}
