package com.company.DynamicProgramming;

public class FindMaximumSquareWithAllZeros {

    private static int findMaxSquareWithAllZeros(int [][]grid){
        int max = 0;
        if(grid.length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;

        int [][]storage = new int[m][n];
        for(int i=0; i<m; i++){
            if(grid[i][0] == 1){
                storage[i][0] = 1;
                max = 1;
            } else{
                storage[i][0] = 0;
            }
        }

        for(int j=0; j<n; j++){
            if(grid[0][j] == 0){
                storage[0][j] = 1;
                max = 1;
            }else{
                storage[0][j] = 0;
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(grid[i][j] == 1){
                    storage[i][j] = 0;
                } else{
                    storage[i][j] = 1 + Math.min(storage[i-1][j-1], Math.min(storage[i-1][j], storage[i][j-1]));
                    if(storage[i][j] > max){
                        max = storage[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String []args){
        int[][] grid = {{0, 0, 0, 1}, {1, 0, 0, 0}, {0, 1, 0, 1}};
        int res = findMaxSquareWithAllZeros(grid);
        System.out.println(res);
    }
}
