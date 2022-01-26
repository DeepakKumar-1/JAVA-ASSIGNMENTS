package com.company.GraphTheory;
import java.util.*;

public class DFTraversal {
    // Depth First Traversal in Graph
    // Similar to PreOrder Traversal of TREE

    public static void DFSTraversal(int [][]adjMatrix, int currentVertex, boolean []visited){
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for(int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i] == 1 && visited[i] == false){
                // So, i is Neighbour of Current Vertex
                DFSTraversal(adjMatrix, i, visited);
            }
        }
    }

    public static void DFSTraversal(int [][]adjMatrix){
        boolean [] visited = new boolean[adjMatrix.length];
        for(int i=0; i< adjMatrix.length; i++) {
            if(! visited[i]) {
                DFSTraversal(adjMatrix, i, visited);
                System.out.println();
            }
        }
    }

    public static void main(String [] args){
        // Take Number of Vertices and Edges from the USER
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print(" Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][] adjMatrix = new int[n][n];
        // Now take All the Edges with Initial and Final Vertices
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        // Now Display the Adjacency Matrix
        for(int [] row: adjMatrix){
            System.out.println(Arrays.toString(row));
        }


        // DFS Traversal
        DFSTraversal(adjMatrix);
    }
}
