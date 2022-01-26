package com.company.GraphTheory;

import java.util.Arrays;
import java.util.Scanner;

// Time Complexity O(n*2^n)
public class TravellingSalesmanProblem {

    public static int travellingSalesmanProblem(int mask, int pos, int[][] dist, int visitedAll, int [][]dp){
        if(mask == visitedAll){
            return dist[pos][0];
        }

        // LookUp
        if(dp[mask][pos] != -1){
            return dp[mask][pos];
        }

        int ans = Integer.MAX_VALUE;
        // Try to Go to an Unvisited City
        for(int city = 0; city <dist.length; city++){
            if((mask & (1<<city)) == 0){
                int newAns = dist[pos][city] + travellingSalesmanProblem(mask|(1<<city), city, dist, visitedAll, dp);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[mask][pos] = ans;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // take Number of Vertices and Edges from the USER
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Create an Adjacency Matrix of size n*n
        int [][] adjMatrix = new int[n][n];
        for(int i=0; i<e; i++) {
            // take Initial Final and Weight
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
              adjMatrix[v2][v1] = weight; // Assuming that Graph is Undirected
        }
        // Defining MASK
        int visitedAll = (1 << n) - 1;

        int [][]dp = new int[(int)Math.pow(2, n)][n];
        for(int [] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(travellingSalesmanProblem(1, 0, adjMatrix, visitedAll,dp));
    }
}

// OUTPUT :
/*
      Enter Number of Vertices: 4
      Enter Number of Edges: 6
        0 1 20
        0 2 42
        0 3 25
        1 2 30
        1 3 34
        2 3 10

        85
 */
