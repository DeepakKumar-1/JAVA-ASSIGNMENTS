package com.company.GraphTheory;
import java.util.*;

public class TopologicalSortUsingDFS {

    private static final Stack<Integer> stack = new Stack<>();

    private static void topological_Sort(int [][]adjMatrix, boolean []visited){

        for(int i=0; i<adjMatrix.length; i++){
            if(!visited[i]){
                dfs(i, adjMatrix, visited);
            }
        }

        while(!stack.isEmpty()){
            int element = stack.pop();
            System.out.print(element + " ");
        }
    }

    public static void dfs(int u, int [][]adjMatrix, boolean []visited){
        visited[u] = true;
        for(int v = 0; v < adjMatrix.length; v++){
            if(adjMatrix[u][v] == 1 && !visited[v]){
                dfs(v, adjMatrix, visited);
            }
        }
        stack.push(u);
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
        }
        topological_Sort(adjMatrix, new boolean[n]);
    }

}
