package com.company.GraphTheory;
import java.util.Scanner;
public class ArticulationPointAndBridge {
    private static int dfsNumberCounter = 0;
//    private static int rootChildren = 0;

    private static void articulationPointAndBridge(int[][] adjMatrix, int u, boolean[] visited, int[] dfs_low, int[] dfs_num, int[] parent, boolean[] articulation_vertex) {
        visited[u] = true;
        dfs_low[u] = dfs_num[u] = dfsNumberCounter++;
        for(int v=0; v<adjMatrix.length; v++){
            if(adjMatrix[u][v] == 1 && !visited[v]){
                // i is Unvisited Neighbour of u
                parent[v] = u;
                articulationPointAndBridge(adjMatrix, v, visited, dfs_low, dfs_num, parent, articulation_vertex);
                dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);              // update dfs_low[u]
                if(dfs_low[v] >= dfs_num[u]){                               // for articulation point
                    articulation_vertex[u] = true;
                }
                if(dfs_low[v] > dfs_num[u]){                                 // for bridge
                    System.out.println("Edge (" + u + ", " + v + ")" + " is Bridge ");
                }
                if(v != parent[u]){    // a back edge and not direct cycle
                    dfs_low[u] = Math.min(dfs_low[u], dfs_num[v]); // update dfs_low[u]
                }
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][] adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        boolean [] visited = new boolean[n];
        int []dfs_num = new int[n];
        int []dfs_low = new int[n];
        boolean []articulation_vertex = new boolean[n];
        int []parent = new int[n];
        for(int v=0; v < n; v++){
            if(!visited[v]){
                articulationPointAndBridge(adjMatrix, v, visited, dfs_low, dfs_num, parent, articulation_vertex);
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(i + " " + dfs_num[i] + " " + dfs_low[i]);
        }
        System.out.println("Articulation Points:");
        for(int i=0; i < n; i++){
            if(articulation_vertex[i]){
                System.out.println("Vertex: " + i);
            }
        }
    }
}

/*
0 2
1 3
2 3
3 4
3 5
 */


