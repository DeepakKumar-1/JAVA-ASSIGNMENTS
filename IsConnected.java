package com.company.GraphTheory;
import java.util.*;

public class IsConnected {

    public static boolean isConnected(int [][] adjMatrix){
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[adjMatrix.length];
        visited[0] = true;
        queue.add(0);

        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            for(int i=0; i< adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        // Now Check that if the Complete boolean Array is true or not
        // if any one is False then return false
        // else return true
        for (boolean hasVisited : visited) {
            if (!hasVisited)
                return false;
        }
        return true;
    }

    public static void main(String [] args){
        // Take Number of VERTICES and EDGES from the USER
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        // take Vertex pairs
        for(int i=0; i<e; i++){
            // take Initial and Final Vertices
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;  // Assuming that Graph is Undirected
        }
        // Now Display the Adjacency Matrix
        for(int [] row: adjMatrix){
            System.out.println(Arrays.toString(row));
        }

        System.out.println(isConnected(adjMatrix));
    }
}
