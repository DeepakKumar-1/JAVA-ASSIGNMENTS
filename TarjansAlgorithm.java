package com.company.GraphTheory;
import java.util.*;
public class TarjansAlgorithm {
    private static final Stack<Integer> stack = new Stack<>();
    static int dfsNumberCounter = 0;
    static int numSCC = 0;
    private static void tarjans_Algorithm(int u, int [][]adjMatrix, int []dfs_num, int []dfs_low, boolean []inStack) {
        dfs_low[u] = dfs_num[u] = dfsNumberCounter++;
        stack.push(u);   // stores u in Stack
        // Mark Vertex u as Visited
        inStack[u] = true;
        for (int i = 0; i < adjMatrix.length; i++) {
            int v = adjMatrix[u][i];
            if (v == 1) {
                if (dfs_num[v] == -1) {      // if v is not visited
                    tarjans_Algorithm(v, adjMatrix, dfs_num, dfs_low, inStack);
                    dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
                }
                //Differentiate back-edge and cross-edge
                else if (inStack[v]) //Back-edge case
                    dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
            }
        }

        if (dfs_low[u] == dfs_num[u]) { // if this is a root (start) of an SCC
            System.out.format("SCC %d:", ++numSCC); // this part is done after recursion
            while (true) {
                int v = stack.pop();
                inStack[v] = false;
                System.out.print(v + " ");
                if (u == v) break; }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();

        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1; // for directed Graph
        }

        int []dfs_num = new int[n];
        Arrays.fill(dfs_num, -1);
        int []dfs_low = new int[n];
        Arrays.fill(dfs_low, -1);
        boolean []inStack = new boolean[n];
        for(int i=0;i< n; i++)
        {
            if(dfs_num[i]==-1)
                tarjans_Algorithm(i, adjMatrix, dfs_num, dfs_low, inStack);   // call DFS for each undiscovered node.
        }
    }
}

/*
0 1
1 3
3 2
2 1
3 4
4 5
5 7
7 6
6 4
 */