package com.company.DynamicProgramming;

public class MagicGrid {

    private static int magicGrid(int [][]grid){
        int m = grid.length;
        int n = grid[0].length;
       int [][]storage = new int[m+1][n+1];

       for(int i=0; i <= n; i++){
           for(int j=0; j <= m; j++){
               storage[i][j] = Integer.MAX_VALUE;
           }
       }
       storage[m][n-1] = 1;
       storage[m-1][n] = 1;

       for(int i=m-1; i>=0; i--){
           for(int j=n-1; j>=0; j--){
               int neededStrength = Math.min(storage[i+1][j], storage[i][j+1]) - grid[i][j];
               storage[i][j] = (neededStrength <= 0)?1 : neededStrength;
           }
       }
       return storage[0][0];
    }

    public static void main(String [] args){
        int [][]grid ={ {-2, -3,   3},
                {-5, -10,  1},
                {10,  30, -5}
        };
        int res = magicGrid(grid);
        System.out.println(res);
    }
}
