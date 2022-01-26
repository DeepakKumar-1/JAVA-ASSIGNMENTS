package com.company.GraphTheory;
import java.util.*;

public class HasPath {
    public static ArrayList<Integer> getPath(int [][] adjMatrix, int s, int e){
        // Declare a Queue
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // Now Declare visited Vertices Array of Type Boolean
        boolean []visited = new boolean[adjMatrix.length];
        // Now Enqueue the Source Vertex in the Queue
        visited[s] = true;
        queue.add(s);
        map.put(s, -1);
        boolean pathFound = false;
        // Now Repeat Following Steps will Queue is not Empty
        while(!queue.isEmpty()){
            // Now Explore all the Adjacent vertices of Current Vertex
            int currentVertex = queue.poll();
            for(int i=0; i< adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    // i is Unvisited Neighbour of Current of Vertex
                    // So add it in the Queue
                    queue.add(i);
                    visited[i] = true;
                    map.put(i, currentVertex);
                    if(i == e){
                        // path Found
                        pathFound = true;
                        break;
                    }
                }
            }
        }
        if(pathFound){
            ArrayList<Integer> path = new ArrayList<>();
            int currentVertex = e;
            while(currentVertex != -1) {
                path.add(currentVertex);
                int parent = map.get(currentVertex);
                currentVertex = parent;
            }
            return path;
        }else{
            return null;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // take Number of Vertices and Edges
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Now Declare Adjacency Matrix of n*n
        int [][] adjMatrix = new int[n][n];
        // Now Take Initial and Terminal vertex Every Edge
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
        // Take Source and End Vertex from the USER
        int source = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(getPath(adjMatrix, source, end));
    }
}
