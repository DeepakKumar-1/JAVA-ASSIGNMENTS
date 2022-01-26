package com.company.GraphTheory;
import java.util.*;
public class GraphEdgesPropertyCheck {
    // STATUS: PENDING

    private static void graphCheck(int [][]adjMatrix, int currentVertex, int []dfs_num, int []parent){
        /*
        -1 -> UNVISITED
         1 -> VISITED
         0 -> EXPLORED
         */
        dfs_num[currentVertex] = 0;
        System.out.println(currentVertex +  " " + parent[currentVertex]);
        for(int i=0; i< adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1) {
                if (adjMatrix[currentVertex][i] == 1 && dfs_num[i] == -1) {
                    parent[i] = currentVertex;
                    graphCheck(adjMatrix, i, dfs_num, parent);
                } else if (dfs_num[i] == 0) {
                    if (i == parent[currentVertex]) // to differentiate these two cases
                        System.out.format(" Two ways (%d, %d)-(%d, %d)\n", currentVertex, i, i, currentVertex);
                    else // the most frequent application: check if the graph is cyclic
                        System.out.format(" Back Edge (%d, %d) (Cycle)\n", currentVertex, i);
                } else if (dfs_num[i] == 1) // EXPLORED->VISITED
                    System.out.printf(" Forward/Cross Edge (%d, %d)\n", currentVertex, i);
            }
        }
        dfs_num[currentVertex] = 1;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        int []dfs_num = new int[n];
        Arrays.fill(dfs_num, -1);
        int []parent = new int[n];
        int count = 0;
        for(int v=0; v < n; v++){
            if(dfs_num[v] == -1){
                System.out.println("Component: " + ++count);
                graphCheck(adjMatrix, 0, dfs_num, parent);
            }
        }
    }
}


/*

            Enter Number of Vertices: 9
            Enter Number of Edges: 7
            0 1
            1 3
            1 2
            2 3
            3 4
            7 6
            6 8


 */