package com.company.DynamicProgramming;

public class FindMinCostMemoization {

    private static int findMinCost(int[][] arr, int row, int col, int [][]storage) {
        int noOfRows = arr.length;
        int noOfColumns = arr[0].length;

        if (row >= noOfRows || col >= noOfColumns) {
            return Integer.MAX_VALUE;
        }

        // Base case :
        if (row == noOfRows - 1 && col == noOfColumns - 1) {
            storage[noOfRows - 1][noOfColumns - 1] = arr[row][col];
            return storage[noOfRows - 1][noOfColumns - 1];
        }

        if(storage[row][col] != -1){
            return storage[row][col];
        }

        int down = findMinCost(arr, row + 1, col, storage);
        int diagonal = findMinCost(arr, row + 1, col + 1, storage);
        int straight = findMinCost(arr, row, col + 1, storage);

      storage[row][col] = arr[row][col] + (Math.min(Math.min(straight, diagonal), down));
      return storage[row][col];
    }

    private static int findMinCost(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int [][]storage = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j< cols; j++){
                storage[i][j] = -1;
            }
        }
        return findMinCost(arr, 0, 0, storage);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4, 8}, {9, 5, 1, 6}, {3, 2, 4, 5}};
        int ans = findMinCost(arr);
        System.out.println("Cost of Minimum Path is: " + ans);
    }
}
