package com.company.GraphTheory;
import java.util.Arrays;
import java.util.Scanner;
public class AdjacencyMatrix {
    public static void main(String [] args){
        // Take Number of Vertices and Edges from the USER
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        //Take Number of Edges from the USER
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Now MAKE adjacency Matrix
        int [][] adjMatrix = new int[n][n];
        // Now Take Edges from the USER
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1; // Assuming that Graph is Undirected
        }
        // Now Display the Resultant Adjacency Matrix
        for(int [] row : adjMatrix){
            System.out.print(Arrays.toString(row));
            System.out.println();
        }

    }
}
