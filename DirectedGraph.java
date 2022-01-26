package com.company.GraphTheory;
import java.util.*;

public class DirectedGraph {
    // Implement a Directed Graph
    public static void main(String [] args){
        // Take Number of Vertices and Edges from the USER
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print(" Enter Number of Edges: ");
        int e = sc .nextInt();
        int [][] adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            // take Initial and Final Vertices
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
        }
        // Display the Adjacency Matrix
        for(int [] row: adjMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
