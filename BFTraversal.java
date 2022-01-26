package com.company.GraphTheory;
import java.util.*;

public class BFTraversal {
    // BFTraversal of the Graph Similar to LEVEL ORDER Traversal of the Tree
    public static void BFSTraversal(int [][] adjMatrix){
        boolean [] visited = new boolean[adjMatrix.length];
        BFSTraversal(adjMatrix, visited, 0);
    }
    public static void BFSTraversal(int [][] adjMatrix, boolean[] visited, int currentVertex){
        // Create a Queue
        if(currentVertex >= adjMatrix.length)
            return;
        Queue<Integer> queue = new LinkedList<>();
        // Step 1 : Enqueue all the Neighbours of currentVertex
        if(!visited[currentVertex]) {
            visited[currentVertex] = true;
            queue.add(currentVertex);
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
            // Now Enqueue all the Elements from the Queue Until the Queue is Empty
            while (!queue.isEmpty()) {
                int element = queue.poll();
                System.out.print(element + " ");
            }
        }
        // Now Visit the Next Current Vertex
        BFSTraversal(adjMatrix, visited, currentVertex+1);

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Take Number of Vertices and Edges from the USER
        System.out.print(" Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print(" Enter Number of Edges: ");
        int e = sc.nextInt();

        int [][] adjMatrix = new int[n][n];
        // Now Take All the Vertex Pairs
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

        BFSTraversal(adjMatrix);
    }
}
