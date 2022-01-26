package com.company.GraphTheory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CycleDetectionUsingKahnsAlgorithm {

    public static boolean cycleDetection(int [][]adjMatrix, int []indegree, boolean []visited){
        Queue<Integer> queue = new LinkedList<>();
        int v = adjMatrix.length;
        // Add all Vertices with indegree 0 in the Queue
        for(int i=0; i<indegree.length; i++){
            if(indegree[i] == 0) {
                queue.add(i);
                visited[i] = true;
            }
        }

        int count = 0;

        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
//            System.out.print(currentVertex + " ");
            for(int j=0; j < v; j++){
                if(adjMatrix[currentVertex][j] == 1 && !visited[j]){
                    // j is Unvisited Neighbour of current Vertex
                    // reduce indegree of j
                    indegree[j]--;
                    queue.add(j);
                    visited[j] = true;
                    //  System.out.println(Arrays.toString(indegree));
                }
            }
            count++;
        }
        return count != v;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        int []indegree = new int[n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            indegree[v2]++;
            adjMatrix[v1][v2] = 1;
        }
        System.out.println(Arrays.toString(indegree));
        boolean []visited = new boolean[n];
        System.out.println("Has Cycle: " + cycleDetection(adjMatrix, indegree, visited));
    }
}

/*

// OUTPUT
           Enter Number of Vertices: 5
           Enter Number of Edges: 5
                0 2
                0 3
                2 3
                1 3
                1 4
                [0, 0, 1, 3, 1]
                Has Cycle: false


            Enter Number of Vertices: 6
            Enter Number of Edges: 7
                0 2
                0 1
                1 2
                1 3
                2 3
                3 4
                2 5
                [0, 1, 2, 2, 1, 1]
                Has Cycle: false


                Enter Number of Vertices: 4
                Enter Number of Edges: 4
                    0 1
                    1 2
                    2 0
                    1 3
                    [1, 1, 1, 1]
                    Has Cycle: true

 */
