package com.company.GraphTheory;
import java.util.*;

public class BFTraversalCode {

    public static void BFSTraversal(int [][] adjMatrix){
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[adjMatrix.length];
        // Marks Source as Visited
        visited[0] = true;
        queue.add(0);

        // keep traveling till the Queue is not Empty
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            // print the Current Vertex
            System.out.print(currentVertex + " ");
            for(int i=0; i< adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    // i is Unvisited Neighbour of Current Vertex
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // take Number of Vertices and Edges from the USER
        System.out.print(" Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print(" Enter Number of Edges: ");
        int e = sc.nextInt();
        // Create  Adjacency Matrix of n*n
        int [][] adjMatrix = new int[n][n];
        // Take all the Edges and Mark those 1 in Matrix
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1; // Assuming that Graph is Undirected
        }
        // Now Display the Adjacency Matrix
        for(int [] row: adjMatrix){
            System.out.println(Arrays.toString(row));
        }

        BFSTraversal(adjMatrix);
    }
}
