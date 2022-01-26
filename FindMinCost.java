package com.company.DynamicProgramming;

public class FindMinCost {

    private static int findMinCost(int [][]arr, int row, int col){
        int noOfRows = arr.length - 1;
        int noOfColumns = arr[0].length - 1;

        if(row == noOfRows && col == noOfColumns){
            return arr[row][col];
        }

        if(row >= noOfRows || col >= noOfColumns){
            return Integer.MAX_VALUE;
        }

        int down = findMinCost(arr, row + 1, col);
        int diagonal = findMinCost(arr, row + 1, col + 1);
        int straight = findMinCost(arr, row, col + 1);

        return arr[row][col] + (Math.min(Math.min(straight, diagonal), down));
    }

    private static int findMinCost(int [][] arr){
        return findMinCost(arr, 0, 0);
    }

    public static void main(String [] args){
        int [][]arr = {{1, 2, 4, 8}, {9, 5, 1, 6}, {3, 2, 4, 5}};
        int ans = findMinCost(arr);
        System.out.println("Cost of Minimum Path is: "  + ans);
    }
}
